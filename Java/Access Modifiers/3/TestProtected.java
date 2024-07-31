import mypackage.ProtectedClass;

public class TestProtected {
    public static void main(String[] args) {
        ProtectedClass obj = new ProtectedClass();
        System.out.println("Protected Field: " + obj.protectedField);
        obj.protectedMethod();
    }
}
