package pertemuan4.oop;

public class Bank {
    public String nama;
    protected int norek;
    private double saldo;

    public Bank(String nama, int norek, double saldo) {
        this.nama = nama;
        this.norek = norek;
        this.saldo = saldo;
    }

    public void menabung(double jumlah) {
        this.saldo += jumlah;
    }

    public void menarik(double jumlah) {
        this.saldo -= jumlah;
    }

    public void mencetak() {
        System.out.println("No. Rekening Nasabah: " + this.norek);
        System.out.println("Nama Nasabah: " + this.nama);
        System.out.printf("Saldo: Rp. %,.2f ", this.saldo);
        System.out.println("\n---------------------");
    }

}
