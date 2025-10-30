package pertemuan6.bentuk;

public class PersegiPanjang extends Bentuk2D {
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luasBidang() {
        return this.panjang * this.lebar;
    }

    @Override
    public double kelilingBidang() {
        return 2 * (this.panjang + this.lebar);
    }

    @Override
    public String toString() {
        return namaBentuk() + " panjang " + this.panjang + " lebar " + this.lebar;
    }
}

