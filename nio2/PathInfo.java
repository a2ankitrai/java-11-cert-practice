import java.nio.file.Path;

class PathInfo {

  public static void printPathInformation(Path path) {
    System.out.println("Filename is: " + path.getFileName());
    System.out.println(" Root is: " + path.getRoot());
    Path currentParent = path;
    while((currentParent = currentParent.getParent()) != null) {
          System.out.println(" Current parent is: " + currentParent);
      }
  }

  public static void main(String[] args) {

      printPathInformation(Path.of("/home/var/logs"));

  }
}
