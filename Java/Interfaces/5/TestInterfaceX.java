
interface InterfaceX {
    void methodOne();

    void methodTwo();
}

class ImplementingClass implements InterfaceX {
    @Override
    public void methodOne() {
        System.out.println("Method One implemented.");
    }

    @Override
    public void methodTwo() {
        System.out.println("Method Two implemented.");
    }
}

public class TestInterfaceX {
    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.methodOne();
        obj.methodTwo();
    }
}
