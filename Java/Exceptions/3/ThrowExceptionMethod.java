public class ThrowExceptionMethod {
    public static void methodThatThrows() throws Exception {
        throw new Exception("This is an exception");
    }

    public static void main(String[] args) {
        methodThatThrows();
    }
}
