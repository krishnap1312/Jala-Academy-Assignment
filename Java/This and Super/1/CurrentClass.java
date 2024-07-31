public class CurrentClass {
    int instanceVariable = 10;

    void printInstanceVariable() {

        System.out.println("Instance variable using 'this': " + this.instanceVariable);
    }

    void printInstanceVariableWithoutThis() {

        System.out.println("Instance variable without 'this': " + instanceVariable);
    }

    public static void main(String[] args) {
        CurrentClass obj = new CurrentClass();
        obj.printInstanceVariable();
        obj.printInstanceVariableWithoutThis();
    }
}
