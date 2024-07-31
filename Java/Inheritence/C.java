
public class C extends B {

    public String instanceVarC = "Instance Var C in C";
    protected String instanceVarCommon = "Common Instance Var in C";

    public void methodC1() {
        System.out.println("Method C1 in C");
    }

    public void methodC2() {
        System.out.println("Method C2 in C");
    }

    @Override
    public void overriddenMethod() {
        System.out.println("Overridden Method in C");
    }
}
