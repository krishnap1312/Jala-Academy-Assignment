public class SubClass extends SuperClass {

    public SubClass() {
        super();
        System.out.println("Subclass default constructor.");
    }

    public SubClass(int a) {
        super(a);
        System.out.println("Subclass one-argument constructor with value: " + a);
    }

    public static void main(String[] args) {
        SubClass obj1 = new SubClass();
        SubClass obj2 = new SubClass(10);
    }
}
