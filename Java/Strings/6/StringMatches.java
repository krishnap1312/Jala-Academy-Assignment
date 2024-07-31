public class StringMatches {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean matches = str.matches("Hello,.*");
        System.out.println("Matches regex: " + matches);
    }
}
