public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        String[] strings = { "Tony", "Yuki" };

        numbers[0] = 2;
        numbers[2] = 5;

        System.out.println(numbers[1]);
        System.out.println(numbers.length);

        listElements(numbers);

        System.out.println(strings[0] + ", " + strings[1]);

    }

    public static void listElements(int[] integerArray) {
        System.out.println("the elements of the array are: ");
        int index = 0;
        while (index < integerArray.length) {
            int number = integerArray[index];
            System.out.print(number + " ");
            index = index + 1;
        }

        System.out.println("");
    }
}
