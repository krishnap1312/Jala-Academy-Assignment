import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String result;

        switch (number % 2) {
            case 0:
                result = "EVEN";
                break;
            case 1:
                result = "ODD";
                break;
            default:
                result = "Invalid";
                break;
        }

        System.out.println("The number is " + result);
    }
}
