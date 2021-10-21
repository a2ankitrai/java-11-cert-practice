import java.io.IOException;

class Device1 implements AutoCloseable {
  String name;
  String header = null;

  public Device1(String name){
    this.name = name;
  }

  public void open() throws IOException{
    header = "OPENED";
    System.out.println("Device opened");
    throw new IOException("Unknown");
  }

  public String read() throws IOException{
    return "";
  }

  public void close(){
    System.out.println("Closing Device " + name);
    header = null;
    throw new RuntimeException("rte while closing " + name);
  }

  public static void main(String[] args) throws Exception{

    try(var d1 = new Device1("d1");
      var d2 = new Device1("d2")) {
      throw new Exception("test");
    }
  }

}
