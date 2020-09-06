import java.nio.file.Path;
import java.nio.file.Paths;

class PathAbsolute {

    public static void main(String[] args) {

        var path1 = Paths.get("/home/work/birds/egret.txt");
        System.out.println("Path1 is Absolute? " + path1.isAbsolute());
        System.out.println("Absolute Path1: " + path1.toAbsolutePath());

        System.out.println("-------------");

        var path2 = Paths.get("birds/condor.txt");
        System.out.println("Path2 is Absolute? " + path2.isAbsolute());
        System.out.println("Absolute Path2 " + path2.toAbsolutePath());
    }
}
