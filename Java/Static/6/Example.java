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
        staticMethod();
    }

    public static void main(String[] args) {

        System.out.println("Static Variable 1: " + Example.staticVar1);
        System.out.println("Static Variable 2: " + Example.staticVar2);

        Example example = new Example();

        System.out.println("Instance Variable 1: " + example.instanceVar1);
        System.out.println("Instance Variable 2: " + example.instanceVar2);
    }
}
