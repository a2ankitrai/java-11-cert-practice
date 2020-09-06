import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

class RealPathTest {

    public static void main(String[] args) throws IOException{

        System.out.println(Paths.get(".").toRealPath());

        System.out.println("--------------------");

        System.out.println(Paths.get("../README.md").toRealPath());


    }
}
