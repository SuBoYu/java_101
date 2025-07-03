import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class File {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                lines.add(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Total lines: " + lines.size());

    }
}
