import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;


class PathAndURI {

    public static void main(String[] args) throws Exception {

      // URI a = new URI("https://ankitrai.com/data/Resume_AnkitRai.pdf");
      // Path b = Path.of(a);
      // Path c = Paths.get(a);
      // URI d = b.toUri();

      URL url = new URL("http://www.wiley.com");
      Path path5 = Paths.get(url.toURI());

      System.out.println(path5);

    }
}
