import java.util.Scanner;

public class NumberEquality {

    public static boolean areEqual(int a, int b) {
        return a == b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (areEqual(num1, num2)) {
            System.out.println("The two numbers are equal.");
        } else {
            System.out.println("The two numbers are not equal.");
        }

        scanner.close();
    }
}
