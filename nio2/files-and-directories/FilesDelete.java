import java.nio.file.*;

class FilesDelete {

    public static void main(String[] args) throws Exception{

        // Directory delete..
        Path b = Path.of("./temp");
        Files.createDirectories(b);
        System.out.println(Files.deleteIfExists(b)); //true
        System.out.println(Files.deleteIfExists(b)); //false

        Path a = Paths.get("./vulture/feathers.txt");
        Files.createFile(a);
        System.out.println("File created");
        Files.delete(a);
        System.out.println("File Deleted");
        Files.delete(a); // java.nio.file.NoSuchFileException


    }
}
