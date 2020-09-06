import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

class SameFileTest {

    public static void main(String[] args) {

        Path p1 = Path.of("./SameFileTest.java");
        var p2 = Paths.get("../../nio2/files-and-directories/SameFileTest.java");

        try {
            System.out.println(Files.isSameFile(p1, p2)); //true
        } catch(IOException e) {
          e.printStackTrace();
        }

        System.out.println("---------------");

        Path p3 = Path.of("/var/home");
        var p4 = Paths.get("/var/home");

        try {
            System.out.println(Files.isSameFile(p3, p4)); //true
        } catch(IOException e) {
          e.printStackTrace();
        }

        System.out.println("---------------");

        Path p5 = Path.of("./SameFileTest.java");
        var p6 = Paths.get("../../nio2/sample.txt");

        try {
            System.out.println(Files.isSameFile(p5, p6)); //false
        } catch(IOException e) {
          e.printStackTrace();
        }

    }
}
