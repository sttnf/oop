package pertemuan6.bentuk;

public class Lingkaran extends Bentuk2D {
    double jari2;
    public static final double PHI = 3.14;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    @Override
    public double luasBidang() {
        return PHI * this.jari2 * this.jari2;
    }

    @Override
    public double kelilingBidang() {
        return 2.0 * PHI * this.jari2;
    }

    @Override
    public String toString() {
        return namaBentuk() + " jari-jari " + this.jari2;
    }
}

