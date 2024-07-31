public class ChildClass extends ParentClass {
    int childVariable = 30;

    void printVariables() {

        System.out.println("Parent variable using 'super': " + super.parentVariable);
        System.out.println("Child variable: " + childVariable);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.printVariables();
    }
}
