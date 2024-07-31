
public class A {

    public String instanceVarA = "Instance Var A in A";
    protected String instanceVarCommon = "Common Instance Var in A";

    public void methodA1() {
        System.out.println("Method A1 in A");
    }

    public void methodA2() {
        System.out.println("Method A2 in A");
    }

    public void overriddenMethod() {
        System.out.println("Overridden Method in A");
    }
}
