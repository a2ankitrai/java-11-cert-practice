import java.util.Scanner;

class TryScopeTest {

public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
                s.nextLine();
        } catch(Exception e) {
                s.nextInt(); // DOES NOT COMPILE
        } finally {
                s.nextInt(); // DOES NOT COMPILE
        }


        try {
                Scanner s = new Scanner(System.in);
                s.nextLine();
        } catch(Exception e) {
                s.nextInt();  // DOES NOT COMPILE
        } finally {
                s.nextInt(); // DOES NOT COMPILE
        }
}

}
