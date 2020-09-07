import java.nio.file.*;
import java.io.*;
import java.util.ArrayList;

class FilesReadingWritingData {

  public static void main(String[] args) {

      System.out.println("Reading from File");

      Path path = Path.of("./a/file.txt");
      try(var reader = Files.newBufferedReader(path)) {
          String currentLine = null;
          while((currentLine = reader.readLine()) != null){
            System.out.println(currentLine);
          }
      } catch(Exception e) {
        e.printStackTrace();
      }

      System.out.println("Writing to File");

      var list = new ArrayList<String>();
      list.add("Smokey");
      list.add("Yogi");
      var path2 = Path.of("./a/bear.txt");
      try (var writer = Files.newBufferedWriter(path2)) {
          for(var line : list) {
              writer.write(line);
              writer.newLine();
          }
      } catch(Exception e) {
        e.printStackTrace();
      }

  }

}
