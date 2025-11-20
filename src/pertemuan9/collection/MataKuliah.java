package pertemuan9.collection;

public class MataKuliah {

    private String kode, nama;
    private int sks; //member2 konstruktor

    public MataKuliah() {
    } //member3 method2

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int i) {
        this.sks = i;
    }

    @Override
    public String toString() {
        return "MataKuliah{" + "kode=" + kode + ", nama=" + nama + ", sks=" + sks + '}';
    }
}