import java.util.function.Function;

class Test3 {
    static long calculate(int factor, Function<Integer, Integer> func) {
        return func.apply(factor);
    }

    public static void main(String[] args) {
        int factor = 2;
        System.out.println(calculate(3, x -> factor * x));
    }
}
