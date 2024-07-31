import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBufferedWriter {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            String text = "Hello, BufferedWriter World!";
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
