import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Clock clock = new Clock();
        // while (true) {
        // System.out.println(clock);
        // clock.advance();
        // }
        Person paul = new Person("Paul", 24);
        Person paulSecond = new Person("Paul", 24);
        Person eve = new Person("Eve");

        System.out.println(paul);
        System.out.println(eve);
        System.out.println(paulSecond);
        System.out.println(paul.equals(paulSecond));

        paul.growOlder();
        System.out.println(paul);

        paul.growOlder(10);

        System.out.println(paul);

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        System.out.println("today is " + day + "." + month + "." + year);
    }
}
