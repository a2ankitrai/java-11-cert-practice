import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        int i = Stream.<Data>empty().findAny()
                .map(d -> d.number)
                .orElseGet(() -> 1);
        System.out.println(i);
    }
}

class Data {
    int number;

    Data(int number) {
        this.number = number;
    }
}
