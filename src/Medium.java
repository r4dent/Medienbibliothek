public class Medium {
    private String title;
    private double wert;
    private String standort;

    public Medium(String title, double wert, String standort) {
        this.title = title;
        this.wert = wert;
        this.standort = standort;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public void  anzeigen(){
        System.out.println("Medium: Title -> " + this.getTitle() + " Wert -> " + this.getWert() + " Standort -> " + this.getStandort());
    }

}
