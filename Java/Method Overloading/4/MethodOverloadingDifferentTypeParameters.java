public class MethodOverloadingDifferentTypeParameters {

    public void show(int a, double b) {
        System.out.println("Method with int and double parameters: " + a + " and " + b);
    }

    public void show(double a, int b) {
        System.out.println("Method with double and int parameters: " + a + " and " + b);
    }

    public static void main(String[] args) {
        MethodOverloadingDifferentTypeParameters obj = new MethodOverloadingDifferentTypeParameters();
        obj.show(10, 20.5);
        obj.show(30.5, 40);
    }
}
