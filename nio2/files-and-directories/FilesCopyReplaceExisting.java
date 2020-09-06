import java.nio.file.*;

class FilesCopyReplaceExisting {

  public static void main(String[] args) {

    try {
      Files.copy(Path.of("./a/file.txt"), Path.of("./b/file-cp.txt"),
      StandardCopyOption.REPLACE_EXISTING);
    } catch(Exception e) {
      e.printStackTrace();
    }


  }

}
