public class Example {

    static int staticVar1 = 10;
    static int staticVar2 = 20;

    int instanceVar1 = 30;
    int instanceVar2 = 40;

    public static void staticMethod() {
        System.out.println("Static Method Called");
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

    }

    public void instanceMethod() {
        System.out.println("Instance Method Called");
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
        staticMethod();
    }

    public static void main(String[] args) {

        Example.staticMethod();

        Example example = new Example();

        example.instanceMethod();

        System.out.println("Static Variable 1 from main: " + Example.staticVar1);
        System.out.println("Static Variable 2 from main: " + Example.staticVar2);
        System.out.println("Instance Variable 1 from main: " + example.instanceVar1);
        System.out.println("Instance Variable 2 from main: " + example.instanceVar2);
    }
}
