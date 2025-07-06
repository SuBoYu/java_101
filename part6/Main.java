import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist list = new Playlist();
        list.addSong("kk");
        list.addSong("tt");

        list.printSongs();

        Scanner scanner = new Scanner(System.in);
        WordSet set = new WordSet();
        UserInterface userInterface = new UserInterface(set, scanner);
        userInterface.start();
    }
}
