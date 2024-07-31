public class StringExamples {
    public static void main(String[] args) {

        String str1 = "Hello, World!";

        String str2 = new String("Hello, World!");

        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("World!");
        String str3 = sb.toString();

        char[] chars = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!' };
        String str4 = new String(chars);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
