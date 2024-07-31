/**
 * This is a documentation comment for the class.
 * It provides an overview of the class functionality.
 * 
 * Documentation comments are used to generate API documentation.
 */


// it is a single Line Comment
public class PrintName {


    /** it is a multiple Line
    comments in java
    */

    public void printMyName() {
        String name = "Krishna";
        System.out.println("My name is: " + name);
    }

    
    public static void main(String[] args) {
        
        PrintName printer = new PrintName();
        
        
        printer.printMyName();
    }
}
