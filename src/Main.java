public class Main {
    public static void main(String[] args) {
        Koffer koffer = new Koffer(120, "");

        koffer.einpacken("Hose");
        koffer.einpacken("Regenschirm");
        koffer.einpacken("Sonnenbrille");
        koffer.einpacken("Tablet");
        koffer.einpacken("Urlaubsgenehmigungszustimmungsformular in zweifacher Ausfertigung mit Gültigkeitsnachweiszertifikat");

        koffer.inhaltAnzeigen();
    }
}
