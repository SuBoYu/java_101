import java.util.Scanner;

public class Readinginput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Wirte a message: ");

            String message = scanner.nextLine();

            System.out.println("Output the message: \n" + message);
        }
    }
}
