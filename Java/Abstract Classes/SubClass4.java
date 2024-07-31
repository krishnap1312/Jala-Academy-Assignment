class SubClass4 extends AbstractClass {
    void abstractMethod() {
        System.out.println("Implementation of the abstract method.");
    }

    void accessMethods() {
        nonAbstractMethod();
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.abstractMethod();
        obj.nonAbstractMethod();

        // Create another instance to call non-abstract methods
        SubClass anotherObj = new SubClass();
        anotherObj.nonAbstractMethod();
    }
}
