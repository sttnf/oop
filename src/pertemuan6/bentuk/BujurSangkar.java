package pertemuan6.bentuk;

public class BujurSangkar extends Bentuk2D {
    double sisi;

    public BujurSangkar(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luasBidang() {
        return this.sisi * this.sisi;
    }

    @Override
    public double kelilingBidang() {
        return 4 * this.sisi;
    }

    @Override
    public String toString() {
        return namaBentuk() + " sisi " + this.sisi;
    }
}

