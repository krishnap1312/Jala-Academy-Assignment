public class MethodOverloadingDifferentReturnType {

    public int compute(int a, int b) {
        return a + b;
    }

    public double compute(int a, int b) {
        return a * b * 0.1;
    }

    public static void main(String[] args) {
        MethodOverloadingDifferentReturnType obj = new MethodOverloadingDifferentReturnType();
        System.out.println("Integer result: " + obj.compute(5, 10));
        System.out.println("Double result: " + obj.compute(5, 10));
    }
}
