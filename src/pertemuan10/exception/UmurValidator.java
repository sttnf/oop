package pertemuan10.exception;

class UmurTidakValidException extends Exception {
    public UmurTidakValidException(String pesan) {
        super(pesan);
    }
}

public class UmurValidator {
    public static void cekUmur(int umur) throws UmurTidakValidException {
        if (umur < 17) {
            throw new UmurTidakValidException("Umur minimal harus 17 tahun!");
        }
    }
}