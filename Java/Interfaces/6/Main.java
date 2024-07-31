interface DefaultMethodInterface {
    default void defaultMethod() {
        System.out.println("Default method.");
    }
}

class ImplementingClass implements DefaultMethodInterface {

}

public class Main {
    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.defaultMethod();
    }
}
