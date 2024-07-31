package anotherpackage;

import mypackage.ProtectedClass;

public class ChildClass extends ProtectedClass {
    public void accessProtectedMembers() {
        System.out.println("Protected Field: " + protectedField);
        protectedMethod();
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.accessProtectedMembers();
    }
}
