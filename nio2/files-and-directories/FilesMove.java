import java.nio.file.*;

class FilesMove {

    public static void main(String[] args) {

      try {

        Path a = Path.of("./zoo");
        Path b = Path.of("./zoo-new");

        if(Files.exists(a)){
          Files.move(a, b);
          System.out.println("Folder moved/renamed from " + a + " to " + b);
        } else if(Files.exists(b)){
          Files.move(b,a);
          System.out.println("Folder moved/renamed from " + b + " to " + a);
        } else{
          System.out.println("Source Folder does not exists");
        }
      } catch(Exception e) {
          e.printStackTrace();
      }

      try {

        Path c = Path.of("./zoo2-old/file.txt");
        Path d = Path.of("./zoo2-new/file2.txt");

        if(Files.exists(c)){
          Files.move(c, d);
          System.out.println("File file.txt moved and renamed from " + c + " to " + d);
        } else if(Files.exists(d)){
          Files.move(d,c);
          System.out.println("File file.txt moved and renamed from " + d + " to " + c);
        } else{
          System.out.println("Source Folder does not exists");
        }
      } catch(Exception e) {
          e.printStackTrace();
      }

    }
}
