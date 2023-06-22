import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        Koffer koffer = new Koffer(120, "");

        while (true) {
//            System.out.println("Wieviele Gegenstände wollen Sie einpacken: ");
//            int anzahl = eingabe.nextInt();
//            eingabe.nextLine(); // <- Flush
            System.out.print("Bitte Gegenstand eingeben: ");
            String gegenstand = eingabe.nextLine();
            if ( gegenstand.isBlank() ) break;
            if ( ! koffer.einpacken(gegenstand) ) {
                System.out.println("Gegenstand ist zu groß");
                System.out.print("Wollen Sie etwas wieder auspacken: ");
                gegenstand = eingabe.nextLine();
                if ( ! gegenstand.isBlank() ) koffer.auspacken(gegenstand);
            }
        }
        koffer.inhaltAnzeigen();
    }
}
