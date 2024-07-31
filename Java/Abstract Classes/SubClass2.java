abstract class AbstractClass {
    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method.");
    }
}

class Subclass2 extends AbstractClass {
    @Override
    void abstractMethod() {
        System.out.println("Implementation of the abstract method.");
    }

    void accessMethods() {
        nonAbstractMethod();
    }

    public static void main(String[] args) {
        Subclass2 obj = new Subclass2();
        obj.abstractMethod();
        obj.nonAbstractMethod();

        // Create another instance to call non-abstract methods
        Subclass2 anotherObj = new Subclass2();
        anotherObj.nonAbstractMethod();
    }
}
