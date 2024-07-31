import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("output.txt")) {
            String text = "Hello, FileWriter World!";
            fw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
