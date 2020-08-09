public enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private final String expectedVisitors;

    // public constructor not allowed. Won't compile.
    public Season(String expectedVisitors) {
       this.expectedVisitors = expectedVisitors;
    }
    public void printExpectedVisitors() {
       System.out.println(expectedVisitors);
    }

}
