public class MyClass {

    public MyClass() {
        System.out.println("Default constructor called.");
    }

    public MyClass(int a) {
        System.out.println("One-argument constructor called with value: " + a);
    }

    public MyClass(int a, String b) {
        System.out.println("Two-argument constructor called with values: " + a + " and " + b);
    }

    public static void main(String[] args) {

        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(10);
        MyClass obj3 = new MyClass(20, "Hello");
    }
}
