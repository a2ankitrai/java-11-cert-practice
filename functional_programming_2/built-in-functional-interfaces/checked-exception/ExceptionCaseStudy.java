import java.io.*;
import java.util.*;
import java.util.function.*;

class ExceptionCaseStudy {

  // The create() method throws a checked exception.
  private static List<String> create() throws IOException {
    throw new IOException();
  }

  // Now we use it in a stream.
  // The calling method handles or declares it.
  public void good() throws IOException {
    ExceptionCaseStudy.create().stream().count();
  }

  // what about this one?
  public static void bad() throws IOException {

      /** compiler error
      * error: incompatible thrown types IOException in functional expression
      */
      Supplier<List<String>> s = ExceptionCaseStudy::create; // DOES NOT COMPILE


      /**
      * The problem is that the lambda to which this method reference expands
        does not declare an exception.
        The Supplier interface does not allow checked exceptions.

        There are two approaches to get around this problem.
      */
  }

  // 1. catch the exception and turn it into an unchecked exception.
  public void ugly(){

    Supplier<List<String>> s = () -> {
            try {
                return ExceptionCaseStudy.create();
              } catch (IOException e) {
                throw new RuntimeException(e);
            }
    };
  }

  //2. create a wrapper method with the try/catch.
  private static List<String> createSafe() {
    try {
      return ExceptionCaseStudy.create();
    } catch (IOException e) {
      throw new RuntimeException(e);
      }
  }

  // Now we can use the safe wrapper in our Supplier without issue.
  public void wrapped() {
    Supplier<List<String>> s2 = ExceptionCaseStudy::createSafe;
  }

  public static void main(String[] args) throws Exception{

  }
}
