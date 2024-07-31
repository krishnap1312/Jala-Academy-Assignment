import mypackage.ProtectedClass;

public class TestAccess {
    public static void main(String[] args) {
        ProtectedClass obj = new ProtectedClass();
        // Attempting to access protected members will fail
        // System.out.println("Protected Field: " + obj.protectedField); // Error
        // obj.protectedMethod(); // Error
    }
}
