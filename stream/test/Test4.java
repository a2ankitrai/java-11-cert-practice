import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        Data data1 = new Data(1);
        Data data2 = new Data(2);
        Object result = Stream.of(data1, data2)
                .reduce(1, (d1, d2) -> d1.number + d2.number);
        System.out.println(result);
    }
}

class Data {
    int number;

    Data(int number) {
        this.number = number;
    }
}
