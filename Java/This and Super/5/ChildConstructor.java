public class ChildConstructor extends ParentConstructor {
    ChildConstructor() {
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new ChildConstructor();
    }
}
