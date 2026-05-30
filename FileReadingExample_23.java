// Q23: File Reading
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {
        String filename = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Contents of " + filename + ":");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
