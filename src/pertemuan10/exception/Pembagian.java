package pertemuan10.exception;

public class Pembagian {
    public static int bagi(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol.");
            return 0; // nilai default
        }
    }
}
