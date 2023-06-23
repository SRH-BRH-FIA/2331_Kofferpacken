import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Koffer testKoffer1 = new Koffer(80, "");
        testKoffer1.einpacken("Schirm");
        testKoffer1.einpacken("Buch");
        testKoffer1.einpacken("Tasche");
        testKoffer1.inhaltAnzeigen();
        testKoffer1.auspacken("Buch");
        testKoffer1.inhaltAnzeigen();

        Koffer testKoffer2 = new Koffer(80, "");
        testKoffer2.einpacken("Schirm");
        testKoffer2.einpacken("Buch");
        testKoffer2.einpacken("Tasche");
        testKoffer2.inhaltAnzeigen();
        testKoffer2.auspacken("Schirm");
        testKoffer2.inhaltAnzeigen();

        Koffer testKoffer3 = new Koffer(80, "");
        testKoffer3.einpacken("Schirm");
        testKoffer3.einpacken("Buch");
        testKoffer3.einpacken("Tasche");
        testKoffer3.inhaltAnzeigen();
        testKoffer3.auspacken("Tasche");
        testKoffer3.inhaltAnzeigen();

        Koffer testKoffer4 = new Koffer(80, "");
        testKoffer4.einpacken("Schirm");
        testKoffer4.inhaltAnzeigen();
        testKoffer4.auspacken("Schirm");
        testKoffer4.inhaltAnzeigen();

        Koffer testKoffer5 = new Koffer(80, "");
        testKoffer5.einpacken("Schirm");
        testKoffer5.einpacken("Frische Socken");
        testKoffer5.einpacken("Tasche");
        testKoffer5.inhaltAnzeigen();
        testKoffer5.auspacken("Frische Socken");
        testKoffer5.inhaltAnzeigen();

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
