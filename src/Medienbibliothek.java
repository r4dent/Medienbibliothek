import java.util.ArrayList;

public class Medienbibliothek {
    private ArrayList<Medium> medienliste;

    public Medienbibliothek(){
        this.medienliste = new ArrayList<>();
    }

    public void mediumHinzufuegen(Medium m){
        this.medienliste.add(m);
    }

    public void alleMedienAusgeben(){
        for(Medium m : medienliste){
            System.out.println("---------------------------");
            m.anzeigen();
        }
    }

    public ArrayList<VHS> alleVHSalsListe(){
        ArrayList<VHS> vhs = new ArrayList<>();
        for (Medium m : medienliste){
            if(m instanceof VHS){
                vhs.add((VHS) m);
            }
        }
        return vhs;
    }
}
