public class Koffer {
    // Attribute
    public int kapazität;
    public String inhalt;

    public Koffer(int kapazität, String inhalt) {
        this.kapazität = kapazität;
        this.inhalt = inhalt;
    }

    public boolean einpacken(String gegenstand) {
        if (inhalt.length() + gegenstand.length() > kapazität) {
            //System.out.println("Koffer ist schon voll");
            return false;
        }
        if ( ! inhalt.isEmpty() ) {
            inhalt += ", ";
        }
        inhalt += gegenstand;
        return true;
    }

    public void auspacken(String gegenstand) {
        String neuerInhalt;
        int positionDesGegenstands = inhalt.indexOf(gegenstand);
        if (positionDesGegenstands < 0) return;

        neuerInhalt = inhalt.substring(0, positionDesGegenstands) +
                      inhalt.substring(positionDesGegenstands + gegenstand.length() + 2, inhalt.length());
        inhalt = neuerInhalt;
    }

    public void inhaltAnzeigen() {
        System.out.println("Der Koffer enthält: " + inhalt);
    }
}
