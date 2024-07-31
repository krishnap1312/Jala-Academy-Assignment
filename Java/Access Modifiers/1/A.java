
public class A {

    private String privateField = "Private Field";

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public static void main(String[] args) {
        A objA = new A();

        System.out.println("Private Field: " + objA.privateField);
        objA.privateMethod();
    }
}
