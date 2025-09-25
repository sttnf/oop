public class HitungRataRata {
    public static void main(String[] args) {
        int[] nilai = {1, 2, 3, 5, 6, 7, 9, 10, 23};
        int jumlah = 0;

        for (int j : nilai) {
            jumlah += j;
        }

        double rata = (double) jumlah / nilai.length;

        System.out.println("Rata-rata = " + rata);
    }
}
