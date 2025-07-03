import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num = Integer.valueOf(reader.nextLine());

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(num);
        }
        reader.close();
    }
}
