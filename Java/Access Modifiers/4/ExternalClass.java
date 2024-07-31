
import anotherpackage.PublicClass;

public class ExternalClass {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();

        System.out.println("Public Field: " + obj.publicField);
        obj.publicMethod();
    }
}
