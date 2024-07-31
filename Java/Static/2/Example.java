public class Example {

    static int staticVar1 = 10;
    static int staticVar2 = 20;

    int instanceVar1 = 30;
    int instanceVar2 = 40;

    public static void printInstanceVariables() {

        Example example = new Example();

        System.out.println("Instance Variable 1: " + example.instanceVar1);
        System.out.println("Instance Variable 2: " + example.instanceVar2);
    }

    public static void main(String[] args) {

        printInstanceVariables();
    }
}
