public class Koffer {
    // Attribute
    public int kapazität;
    public String inhalt;

    public Koffer(int kapazität, String inhalt) {
        this.kapazität = kapazität;
        this.inhalt = inhalt;
    }

    public void einpacken(String gegenstand) {
        if (inhalt.length() + gegenstand.length() > kapazität) {
            System.out.println("Koffer ist schon voll");
            return;
        }
        if ( ! inhalt.isEmpty() ) {
            inhalt += ", ";
        }
        inhalt += gegenstand;
    }

    public void auspacken(String gegenstand) {
        // TODO
    }

    public void inhaltAnzeigen() {
        System.out.println("Der Koffer enthält: " + inhalt);
    }
}
