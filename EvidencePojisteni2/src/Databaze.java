import java.util.ArrayList;

public class Databaze {
    private ArrayList<Zaznam> zaznamy;

    public Databaze() {
        zaznamy = new ArrayList<>();
    }
    public ArrayList<Zaznam> vratZaznamy() {
        return zaznamy;
    }
    public void pridejZaznam(String jmeno, String prijmeni, String telefon, Integer vek) {
        zaznamy.add(new Zaznam(jmeno,prijmeni,vek,telefon));
    }

    public ArrayList<Zaznam> najdiZaznamy() {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        return nalezene;
    }
}