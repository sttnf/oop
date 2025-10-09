package pertemuan1.praktikum1;

public class Operasi {
    public static void main(String[] args) {
        float rad1 = 14.0F;
        float luas1, luas2;
        luas1 = 22f / 7 * rad1 * rad1;
        luas2 = rad1 * rad1 * 22 / 7;
        boolean kecilDari = luas1 < luas2;
        System.out.println("Luas 1 = " + luas1);
        System.out.println("Luas 2 = " + luas2);
        System.out.println("Luas 1 < Luas 2 = " + kecilDari);
    }
}
