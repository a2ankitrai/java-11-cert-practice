import java.nio.file.Files;
import java.nio.file.Paths;

class FilesExist {

    public static void main(String[] args) {

      var b1 = Files.exists(Paths.get("/ostrich/feathers.png"));
      System.out.println("Path " + (b1 ? "Exists" : "Missing"));
      
      var b2 = Files.exists(Paths.get("../../README.md"));
      System.out.println("Path " + (b2 ? "Exists" : "Missing"));
    }
}
