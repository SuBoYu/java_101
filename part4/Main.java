import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        for (Person person : persons) {
            System.out.println(person);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the details, empty will stop: ");

            String details = scanner.nextLine();

            if (details.isEmpty()) {
                break;
            }

            String[] parts = details.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);

            persons.add(new Person(name, age));
        }

        System.out.println();
        System.out.println("Persons in total: " + persons.size());
        System.out.println("Persons: ");

        for (Person person : persons) {
            System.out.println(person);
        }

        scanner.close();

    }
}
