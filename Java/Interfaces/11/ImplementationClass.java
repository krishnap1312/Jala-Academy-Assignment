public class ImplementationClass implements StaticFinalVariableInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Implemented interface method.");
    }

    public static void main(String[] args) {
        ImplementationClass obj = new ImplementationClass();
        obj.interfaceMethod();
        System.out.println("Interface constant value: " + StaticFinalVariableInterface.CONSTANT_VALUE);
    }
}
