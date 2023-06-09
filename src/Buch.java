public class Buch extends Medium {
    private String isbn;

    public Buch(String title, double wert, String standort, String isbn) {
        super(title, wert, standort);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void anzeigen() {
        super.anzeigen();
        System.out.println("[Buch] ISBN -> " + this.getIsbn());
    }
}
