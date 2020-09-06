import java.nio.file.Path;
import java.nio.file.Paths;

class PathTest2 {

    public static void main(String[] args) {

        Path p = Path.of("Whale");
        p.resolve("Kriller");
        System.out.println(p);

        System.out.println("---------------------");

        Path path = Paths.get("/land/hippo/harry.happy/sad/bloom");
        System.out.println("The Path Name is: " + path);
        for(int i=0; i<path.getNameCount(); i++) {
          System.out.println(" Element " + i + " is: " + path.getName(i));
        }

        System.out.println("---------------------");
        var p1 = Path.of("/");
        System.out.println(p1.getNameCount()); // 0
        System.out.println(p1.getName(0)); // IllegalArgumentException

    }
}
