public class MethodOverloadingDifferentTypes {

    public void show(int a) {
        System.out.println("Method with one integer parameter: " + a);
    }

    public void show(double a) {
        System.out.println("Method with one double parameter: " + a);
    }

    public static void main(String[] args) {
        MethodOverloadingDifferentTypes obj = new MethodOverloadingDifferentTypes();
        obj.show(10);
        obj.show(10.5);
    }
}
