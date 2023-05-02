public class VHS extends Medium{
    private  int spieldauer;
    private String quality;

    public VHS(String title, double wert, String standort, int spieldauer, String filmqualitaet) {
        super(title, wert, standort);
        this.spieldauer = spieldauer;
        this.quality = filmqualitaet;
    }

    public int getSpieldauer() {
        return spieldauer;
    }

    public void setSpieldauer(int spieldauer) {
        this.spieldauer = spieldauer;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void anzeigen() {
        super.anzeigen();
        System.out.println("[VHS] Spieldauer -> " + this.getSpieldauer() + " Qualitaet -> " + this.getQuality());
    }
}
