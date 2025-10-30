package pertemuan6.bentuk;

public class KumpulanBentuk {
    public static void main(String[] args) {
        Bentuk2D b1 = new Lingkaran(8);
        Bentuk2D b2 = new Lingkaran(5);
        Bentuk2D p = new PersegiPanjang(10, 4);
        Bentuk2D bs = new BujurSangkar(6);
        Bentuk2D t = new SegiTiga(3, 4, 5, 3, 4);

        Bentuk2D ar_bentuk[] = {b1, b2, p, bs, t};

        for (Bentuk2D b2d : ar_bentuk) {
            System.out.println(b2d + " luasnya " + b2d.luasBidang() + " keliling " + b2d.kelilingBidang());
        }
    }
}
