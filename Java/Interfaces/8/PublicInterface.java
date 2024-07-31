public interface PublicInterface {
    int SOME_CONSTANT = 10;

    void interfaceMethod();

    default void defaultMethod() {
        System.out.println("Default method in interface.");
    }
}