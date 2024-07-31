public class VariableScopeExample {

    
    static String name = "Global Name";

    public static void main(String[] args) {
        
        String name = "Local Name";

        
        System.out.println("Local variable 'name': " + name);

        
        printGlobalVariable();
    }
    
    public static void printGlobalVariable() {
        
        System.out.println("Global variable 'name': " + VariableScopeExample.name);
    }
}
