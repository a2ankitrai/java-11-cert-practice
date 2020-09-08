import java.nio.file.*;

class FilesAttributes {

    public static void main(String[] args) throws Exception {

        System.out.println("Is Directory check");
        System.out.println("--------------------");

        System.out.println(Files.isDirectory(Paths.get("/canine/fur.jpg"))); //false
        System.out.println(Files.isDirectory(Paths.get("./a/bear.txt"))); // false
        System.out.println(Files.isDirectory(Paths.get("./a"))); //true

        System.out.println();
        System.out.println("Is SymbolicLink check");
        System.out.println("--------------------");
        System.out.println(Files.isSymbolicLink(Paths.get("/canine/coyote")));// false
        System.out.println(Files.isSymbolicLink(Paths.get("./a/bear.txt")));// false

        Path target = Paths.get("./a/bear.txt");
        Path link = Paths.get(".","symbolic-link-bear.txt");
        deleteIfExists(link);
        Files.createSymbolicLink(link,target);
        System.out.println(Files.isSymbolicLink(link));

        System.out.println();
        System.out.println("Is RegularFile check");
        System.out.println("--------------------");

        System.out.println(Files.isRegularFile(Paths.get("/canine/types.txt")));// false
        System.out.println(Files.isRegularFile(Paths.get("./a"))); //false
        System.out.println(Files.isRegularFile(Paths.get("./a/bear.txt"))); // true
        System.out.println(Files.isRegularFile(link)); // true

    }

    private static void deleteIfExists(Path path) throws Exception{
      if(Files.exists(path)){
        Files.delete(path);
      }
    }
}
