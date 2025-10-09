package pertemuan3.praktikum1.array;

public class HimpunanNilai {

    public static void main(String[] args) {
        int[] nilai = {80, 85, 90, 75, 88};

        System.out.println("Jumlah elemant: " + nilai.length);

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }

//        Hitung rata-rata
        int jumlah = 0;
        for (int j : nilai) {
            jumlah += j;
        }
        double rata = (double) jumlah / nilai.length;

        System.out.println("Rata-rata = " + rata);
    }
}
