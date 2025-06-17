public class ProgramStructure {
    public static void main(String[] args) {
        greet(1);
        System.out.println("");
        greet(3);
    }

    public static void greet(int numOfTime) {
        int i = 0;
        while (i < numOfTime) {
            System.out.println("Greeting");
            i++;
        }
    }
}
