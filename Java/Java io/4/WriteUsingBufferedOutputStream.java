import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingBufferedOutputStream {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            String text = "Hello, Buffered World!";
            bos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
