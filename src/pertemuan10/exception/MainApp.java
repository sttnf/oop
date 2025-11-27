package pertemuan10.exception;

public class MainApp {
    public static void main(String[] args) {
        int a = InputanAngka.inputAngka("Masukkan angka pertama: ");
        int b = InputanAngka.inputAngka("Masukkan angka kedua: ");
        int hasil = Pembagian.bagi(a, b);
        System.out.println("Hasil pembagian: " + hasil);
        int umur = InputanAngka.inputAngka("Masukkan umur: ");
        try {
            UmurValidator.cekUmur(umur);
            System.out.println("Umur valid!");
        } catch (UmurTidakValidException e) {
            System.out.println("Error Umur: " + e.getMessage());
        }
        System.out.println("Program selesai.");
    }
}
