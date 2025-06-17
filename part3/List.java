import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Tony");
        list.add("Yuki");
        list.add("Jason");

        for (int idx = 0; idx < list.size(); idx++) {
            System.out.println(list.get(idx));
        }

        list.remove(1);
        list.remove("Jason");

        print(list);

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(15);
        intList.add(18);
        intList.add(21);
        intList.add(24);

        intList.remove(2);
        intList.remove(Integer.valueOf(15));

        System.out.println("Index 0 so the first value: " + intList.get(0));
        System.out.println("Index 1 so the second value: " + intList.get(1));

        if (list.contains("Tony")) {
            System.out.println("Tony can still be found");
        }
    }

    public static void print(ArrayList<String> list) {
        for (String value : list) {
            System.out.println(value);
        }
    }

}