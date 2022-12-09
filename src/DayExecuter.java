import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DayExecuter extends Day5 {

    public static void main (String[] args) {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("data/input3.txt"));
            System.out.println("Your score would be: " + getScore(allLines));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}