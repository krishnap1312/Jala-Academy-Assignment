public class Example {

    static int staticVar1 = 10;
    static int staticVar2 = 20;

    int instanceVar1 = 30;
    int instanceVar2 = 40;

    public void printInstanceVariables() {
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
    }

    public static void callInstanceMethod() {

        Example example = new Example();

        example.printInstanceVariables();
    }

    public static void main(String[] args) {

        callInstanceMethod();
    }
}
