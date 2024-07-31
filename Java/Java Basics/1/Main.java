// Person.java
class Person {
    // Fields (Attributes)
    private String firstName;
    private String lastName;
    private int age;

    // Constructor to initialize the object
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    
    public String getFirstName() {
        return firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public String getFullName() {
        return firstName + " " + lastName;
    }

    
    public void celebrateBirthday() {
        this.age += 1;
    }

    
    public String introduce(String greeting) {
        return greeting + ", I'm " + getFullName() + " and I'm " + age + " years old.";
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}
// Main.java
public class Main {
    public static void main(String[] args) {
        
        Person person1 = new Person("Krishna", "Prasad", 25);

        
        System.out.println("First Name: " + person1.getFirstName());
        System.out.println("Last Name: " + person1.getLastName());  

        
        System.out.println("Full Name: " + person1.getFullName()); 
        person1.celebrateBirthday();
        System.out.println("Age: " + person1.getAge());
        System.out.println(person1.introduce("Hello")); 
    }
}
