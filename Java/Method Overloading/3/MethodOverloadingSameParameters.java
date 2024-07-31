public class MethodOverloadingSameParameters {

    public void print(int a, int b) {
        System.out.println("Method with two integer parameters: " + a + " and " + b);
    }

    public void print(int a, int b) {
        System.out.println("Different implementation with same parameters: " + (a + b));
    }

    public static void main(String[] args) {
        MethodOverloadingSameParameters obj = new MethodOverloadingSameParameters();
        obj.print(5, 10);
    }
}
