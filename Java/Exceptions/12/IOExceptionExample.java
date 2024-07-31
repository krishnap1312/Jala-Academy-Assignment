import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter(new File("/invalid/path/file.txt"));
            writer.write("Hello World");
            writer.close();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
