import java.nio.file.Path;

class PathResolve {

  public static void main(String[] args) {

    Path p1 = Path.of("/home/var");
    Path p2 = Path.of("logs/ankit");

    Path pr1 = p1.resolve(p2);
    System.out.println(pr1); // /home/var/logs/ankit

    Path pr2 = p2.resolve(p1);
    System.out.println(pr2); // /home/var

  }

}
