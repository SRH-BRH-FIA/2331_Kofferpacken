import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        Koffer koffer = new Koffer(120, "");

        while (true) {
            System.out.print("Bitte Gegenstand eingeben: ");
            String gegenstand = eingabe.nextLine();
            if ( gegenstand.isBlank() ) break;
            koffer.einpacken(gegenstand);
        }
        koffer.inhaltAnzeigen();
    }
}
