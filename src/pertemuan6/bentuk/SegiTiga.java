package pertemuan6.bentuk;

public class SegiTiga extends Bentuk2D {
    double sisiA, sisiB, sisiC, alas, tinggi;

    public SegiTiga(double sisiA, double sisiB, double sisiC, double alas, double tinggi) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luasBidang() {
        return 0.5 * this.alas * this.tinggi;
    }

    @Override
    public double kelilingBidang() {
        return this.sisiA + this.sisiB + this.sisiC;
    }

    @Override
    public String toString() {
        return namaBentuk() + " sisi " + sisiA + ", " + sisiB + ", " + sisiC + " alas " + alas + " tinggi " + tinggi;
    }
}

