public class ChildClass extends ParentClass {
    void display() {
        System.out.println("Display method in child class.");
    }

    void callMethods() {
        this.display();
        super.display();
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.callMethods();
    }
}
