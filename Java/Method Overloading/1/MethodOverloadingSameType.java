public class MethodOverloadingSameType {

    public void display(int a) {
        System.out.println("Method with one integer parameter: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Method with two integer parameters: " + a + " and " + b);
    }

    public static void main(String[] args) {
        MethodOverloadingSameType obj = new MethodOverloadingSameType();
        obj.display(10);
        obj.display(20, 30);
    }
}
