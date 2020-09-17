
public class AutoCloseableTest {

static class MyFileReader implements AutoCloseable {
private String tag;
public MyFileReader(String tag) {
        this.tag = tag;
}
@Override public void close() {
        System.out.println("Closed: "+tag);
}
}

public static void main(String[] args) {

        try (var bookReader = new MyFileReader("monkey")) {
                System.out.println("Try Block");
        } finally {
                System.out.println("Finally Block");
        }

        System.out.println("------------");

        try (var bookReader = new MyFileReader("1");
             var movieReader = new MyFileReader("2");
             var tvReader = new MyFileReader("3"); ) {
                System.out.println("Try Block");
        } finally {
                System.out.println("Finally Block");
        }

}

}
