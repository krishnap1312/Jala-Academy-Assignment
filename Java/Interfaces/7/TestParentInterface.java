
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class ImplementationClass implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Parent method.");
    }

    @Override
    public void childMethod() {
        System.out.println("Child method.");
    }

    public static void main(String[] args) {
        ImplementationClass obj = new ImplementationClass();
        obj.parentMethod();
        obj.childMethod();
    }
}
