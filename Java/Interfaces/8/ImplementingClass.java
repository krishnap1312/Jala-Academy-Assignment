
public class ImplementingClass implements PublicInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Implemented interface method.");
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.interfaceMethod();
        obj.defaultMethod();
        System.out.println("Interface constant: " + PublicInterface.SOME_CONSTANT);
    }
}
