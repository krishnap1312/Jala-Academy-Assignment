public class Example {

    // Static variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // Instance variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // Static method 1
    public static void staticMethod1() {
        System.out.println("Static Method 1");
        // Print static variables
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

        // Cannot access instance variables or methods directly
        // System.out.println("Instance Variable 1: " + instanceVar1); // Error
        // instanceMethod1(); // Error
    }

    // Static method 2
    public static void staticMethod2() {
        System.out.println("Static Method 2");
        // Call another static method
        staticMethod1();
    }

    // Instance method 1
    public void instanceMethod1() {
        System.out.println("Instance Method 1");
        // Print static variables in an instance method
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

        // Access instance variables
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);

        // Call another instance method
        instanceMethod2();
    }

    // Instance method 2
    public void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    // Main method
    public static void main(String[] args) {
        // Print static variables
        System.out.println("In Main Method");
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

        // Call static methods
        staticMethod1();
        staticMethod2();

        // Create an instance of Example
        Example example = new Example();

        // Print instance variables
        System.out.println("Instance Variable 1: " + example.instanceVar1);
        System.out.println("Instance Variable 2: " + example.instanceVar2);

        // Call instance methods
        example.instanceMethod1();
        example.instanceMethod2();
    }
}
