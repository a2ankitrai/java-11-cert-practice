import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileTime;
import java.io.IOException;

class FilesReadAttributes {

  public static void main(String[] args) throws IOException{

    Path path = Paths.get("./a/file.txt");
    BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);

    System.out.println(data);

    System.out.println("Is a directory? " + data.isDirectory());
    System.out.println("Is a regular file? " + data.isRegularFile());
    System.out.println("Is a symbolic link? " + data.isSymbolicLink());
    System.out.println("Size (in bytes): " + data.size());
    System.out.println("Last modified: " + data.lastModifiedTime());


    System.out.println("\n-----------------\n");

    // Read file attributes
    var path2 = Paths.get("./a/file.txt");
    BasicFileAttributeView view =
        Files.getFileAttributeView(path2, BasicFileAttributeView.class);
    BasicFileAttributes attributes = view.readAttributes();

    System.out.println("before modification: " + Files.getLastModifiedTime(path2));

    // Modify file last modified time
    FileTime lastModifiedTime = FileTime.fromMillis(
    attributes.lastModifiedTime().toMillis() - (60 * 60 * 24 * 1000));
    view.setTimes(lastModifiedTime, null, null);

    System.out.println("before modification: " + Files.getLastModifiedTime(path2));

  }
}
