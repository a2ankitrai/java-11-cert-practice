public class Test9 {
    public static void main(String[] args) {
        new C().m();
    }
}

interface A {
    default void m() {
        System.out.println("A");
    }
}

interface A1 {
    default void m() {
        System.out.println("A1");
    }
}

abstract class B {
    public void m() {
        System.out.println("B");
    }
}

class C extends B implements A, A1 { }
