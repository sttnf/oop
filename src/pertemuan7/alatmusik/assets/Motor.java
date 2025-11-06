package pertemuan7.alatmusik.assets;

public class Motor implements Assets {
    public String merk;
    public int cc, tahun;

    public Motor() {
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    @Override
    public double nilaiAsset() {
        return 30_000_000;
    }

    @Override
    public String toString() {
        return "Motor{" + "merk=" + merk + ", cc=" + cc + ", tahun=" + tahun + '}';
    }
}
