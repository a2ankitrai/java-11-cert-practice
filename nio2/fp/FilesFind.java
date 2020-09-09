import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;
import java.io.IOException;


/**
Find all the java files in the nio2 directory with size greater that 500 bytes
**/
class FilesFind {

    public static void main(String[] args) throws IOException {


        Path path = Paths.get("../");
        long minSize = 500;

        try(var s = Files.find(path, 10,
            (p,a) -> a.isRegularFile()
                && p.toString().endsWith(".java")
                && a.size() > minSize)) {

                  s.forEach(System.out::println);
        }


    }

}
