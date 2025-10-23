package pertemuan5;

public class Dosen extends Person {
    private String nidn;
    private String gelar;

    public Dosen() {
        super();
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    @Override
    public String toString() {
        return "Dosen{" + super.toString() + '\'' +
                "Gelar: '" + gelar + '\'' +
                "NIDN: " + nidn + '\'' +
                '}';
    }
}
