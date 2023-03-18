public class Zaznam {
    private String jmeno;
    private String prijmeni;
    private Integer vek;
    private String telefon;
    public Zaznam(String jmeno, String prijmeni, Integer vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    public String getJmeno() {
        return this.jmeno;
    }

    public String getPrijmeni() {
        return this.prijmeni;
    }

    @Override
    public String toString() {
        return this.jmeno + " " + this.prijmeni + " " + this.vek + " " + this.telefon + " ";
    }
}
