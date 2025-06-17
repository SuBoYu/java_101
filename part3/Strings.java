public class Strings {
    public static void main(String[] args) {
        String str = "course";

        if (str.equals("marzipan")) {
            System.out.println("The str variable contains the text marzipan.");
        } else {
            System.out.println("The str variable does not contain the text marzipan.");
        }

        System.out.println(str.charAt(0));
        System.out.println(str.length());

        String text = "first second third fourth";
        String[] pieces = text.split(" ");
        System.out.println(pieces[0]);
        System.out.println(pieces[1]);
        System.out.println(pieces[2]);
        System.out.println(pieces[3]);

        System.out.println();

        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);
        }
    }
}
