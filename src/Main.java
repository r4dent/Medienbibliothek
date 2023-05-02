import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Medienbibliothek");
        Medienbibliothek bib = new Medienbibliothek();

        VHS heman = new VHS("Masters of the Universe", 120.00, "Wohnzimmer",120, "540p");
        Cartridge zelda = new Cartridge("Adventures of Zelda", 25.50, "Schlafzimmer", true, "Nintendo",Konsolentyp.nes);
        Buch potter = new Buch("Stein der Weisen", 50, "Badezimmer", "34567890");

        bib.mediumHinzufuegen(heman);
        bib.mediumHinzufuegen(zelda);
        bib.mediumHinzufuegen(potter);

        bib.alleMedienAusgeben();

        System.out.println("----- Alle VHS anzeigen -----");
        for (VHS vhs : bib.alleVHSalsListe()){
            vhs.anzeigen();
        }
    }
}