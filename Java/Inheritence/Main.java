
public class Main {
    public static void main(String[] args) {

        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.methodA1();
        objA.methodA2();
        objB.methodB1();
        objB.methodB2();
        objC.methodC1();
        objC.methodC2();

        objA.overriddenMethod();
        objB.overriddenMethod();
        objC.overriddenMethod();

        A refAB = objB;
        A refAC = objC;

        refAB.overriddenMethod();
        refAC.overriddenMethod();

        System.out.println("Instance Var A: " + objA.instanceVarA);
        System.out.println("Instance Var B: " + objB.instanceVarB);
        System.out.println("Instance Var C: " + objC.instanceVarC);

        System.out.println("Common Instance Var in A: " + objA.instanceVarCommon);
        System.out.println("Common Instance Var in B: " + objB.instanceVarCommon);
        System.out.println("Common Instance Var in C: " + objC.instanceVarCommon);
    }
}
