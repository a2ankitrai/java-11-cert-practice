
class FinalAccess {

public void relax() {

        final var bookReader = new MyFileReader("4");
        MyFileReader movieReader = new MyFileReader("5");

        try (bookReader;
             var tvReader = new MyFileReader("6");
             movieReader ){

                System.out.println("Try Block");
        }
        finally {
                System.out.println("Finally Block");
        }

}

public static void main(String[] args) {

        FinalAccess fa = new FinalAccess();

        fa.relax();

}


}
