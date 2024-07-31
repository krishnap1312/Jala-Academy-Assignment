interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class CombinedImplementation implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Method A from InterfaceA");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from InterfaceB");
    }

    public static void main(String[] args) {
        CombinedImplementation obj = new CombinedImplementation();
        obj.methodA();
        obj.methodB();
    }
}
