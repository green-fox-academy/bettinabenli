import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        List<String> content = new ArrayList(
                Arrays.asList(
                        "First Line",
                        "Second Line",
                        "Third Line",
                        "Fourth Line",
                        "Fifth Line"
                )
        );

        Path filePath = Paths.get("my-file1.txt");
        try {
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println(" Could not write a file :( ");
        }

        List<String> readLines = null;
        try {
            readLines = getAllCat();
        } catch (IOException e) {
            System.out.println("Could not read the file :(");
        } finally {
            if (readLines != null) {
                for (String line : readLines) {
                    System.out.println(line);
                }
            }
        }

    }


    public static List<String> getAllCat() throws IOException {
        Path filePath = Paths.get("my-file1.txt");
        return Files.readAllLines(filePath);

    }
}