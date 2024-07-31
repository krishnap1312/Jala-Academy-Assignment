interface SomeInterface {
    void performAction();
}

class ImplementationClass implements SomeInterface {
    @Override
    public void performAction() {
        System.out.println("Action performed.");
    }
}

public class Main {
    public static void main(String[] args) {
        SomeInterface instance = new ImplementationClass();
        instance.performAction();
    }
}
