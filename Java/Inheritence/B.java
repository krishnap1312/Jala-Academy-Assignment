
public class B extends A {

    public String instanceVarB = "Instance Var B in B";
    protected String instanceVarCommon = "Common Instance Var in B";

    public void methodB1() {
        System.out.println("Method B1 in B");
    }

    public void methodB2() {
        System.out.println("Method B2 in B");
    }

    @Override
    public void overriddenMethod() {
        System.out.println("Overridden Method in B");
    }
}
