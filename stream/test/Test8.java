import java.nio.file.*;
import java.io.*;

public class Test8 {
    public static void main(String[] args) throws IOException {
        Path p = Path.of("f1.txt");
        Files.writeString(p, "Hello");
        var out = Files.newOutputStream(Path.of("f2.txt"));
        Files.copy(p, out);
        // Files.copy(p, System.out);
    }
}
