import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        String text = "contain text";
        int wholeNumber = 123;
        double floatingPoint = 3.14;
        boolean trueOrFalse = true;

        System.out.println("Text: " + text);
        System.out.println("Int: " + wholeNumber);
        System.out.println("Float: " + floatingPoint);
        System.out.println("Bool: " + trueOrFalse);
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a value: ");

        boolean value = Boolean.valueOf(scanner.nextLine());

        System.out.println("You wrote: " + value);
    }
}
