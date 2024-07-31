public class StringComparisons {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello, World!";

        System.out.println("EqualsIgnoreCase: " + str1.equalsIgnoreCase(str2));
        System.out.println("StartsWith: " + str1.startsWith("He"));
        System.out.println("EndsWith: " + str3.endsWith("World!"));
        System.out.println("CompareTo: " + str1.compareTo("Hello"));
    }
}
