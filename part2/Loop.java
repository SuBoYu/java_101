import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numbersRead = 0;
        int sum = 0;

        while (true) {
            if (numbersRead == 5) {
                break;
            }
            System.out.println("Input num");
            sum = sum + Integer.valueOf(reader.nextLine());
            numbersRead = numbersRead + 1;
        }
        System.out.println("The sum of the num is: " + sum);

        reader.close();
    }
}
