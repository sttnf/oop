package pertemuan4.oop;

public class Transaksi {
    public static void main(String[] args) {
        Bank n1 = new Bank("Budi", 111, 50_000);
        Bank n2 = new Bank("Deden", 112, 70_000);
        Bank n3 = new Bank("Siti", 112, 40_000);

        n1.menabung(300_000);
        n2.menabung(100_000);
        n2.menarik(200_000);
        n3.menarik(200_000);

        n1.mencetak();
        n2.mencetak();
        n3.mencetak();
    }
}
