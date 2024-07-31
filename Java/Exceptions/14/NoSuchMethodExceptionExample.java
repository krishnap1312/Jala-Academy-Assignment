import java.lang.reflect.Method;

public class NoSuchMethodExceptionExample {
    public static void main(String[] args) {
        try {
            Class<?> cls = String.class;
            Method method = cls.getMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("Caught NoSuchMethodException: " + e.getMessage());
        }
    }
}
