class SubClass extends AbstractClass {
    void abstractMethod() {
        System.out.println("Implementation of the abstract method.");
    }

    void accessMethods() {
        nonAbstractMethod();
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.accessMethods();
    }
}
