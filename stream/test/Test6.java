import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.function.ToDoubleFunction;

public class Test6 {
    public static void main(String[] args) {
        Movie m1 = new Movie("Casino Royale", 9.5);
        Movie m2 = new Movie("Quantum of Solace", 6.5);
        Movie m3 = new Movie("Skyfall", 9.3);
        Movie m4 = new Movie("Spectre", 6.5);
        Stream stream = Stream.of(m1, m2, m3, m4);
        // Insert here
        ToDoubleFunction func = Movie::getRating;
        double average = stream.collect(Collectors.averagingDouble(func));

        System.out.println(average);
    }
}

class Movie {
    String title;
    double rating;

    Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    String getTitle() {
        return title;
    }

    double getRating() {
        return rating;
    }
}
