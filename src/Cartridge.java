public class Cartridge extends Medium {
    private boolean vollstaendigesSet;
    private String entwicklerstudio;
    private Konsolentyp konsole;

    public Cartridge(String title, double wert, String standort, boolean vollstaendigesSet, String entwicklerstudio, Konsolentyp konsole) {
        super(title, wert, standort);
        this.vollstaendigesSet = vollstaendigesSet;
        this.entwicklerstudio = entwicklerstudio;
        this.konsole = konsole;
    }

    public boolean isVollstaendigesSet() {
        return vollstaendigesSet;
    }

    public void setVollstaendigesSet(boolean vollstaendigesSet) {
        this.vollstaendigesSet = vollstaendigesSet;
    }

    public String getEntwicklerstudio() {
        return entwicklerstudio;
    }

    public void setEntwicklerstudio(String entwicklerstudio) {
        this.entwicklerstudio = entwicklerstudio;
    }

    public Konsolentyp getKonsole() {
        return konsole;
    }

    public void setKonsole(Konsolentyp konsole) {
        this.konsole = konsole;
    }

    public void anzeigen(){
        super.anzeigen();
        System.out.println("[Cartridge] Vollständig -> " + this.isVollstaendigesSet() + " Entwicklerstudio -> " + this.entwicklerstudio + " Konsolentyp -> " + this.konsole);
    }
}
