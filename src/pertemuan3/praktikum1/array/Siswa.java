package pertemuan3.praktikum1.array;

public class Siswa {
    public static void main(String[] args) {
        Object[][] data = {{"Fawwaz", 19, 55.5f}, {"Inaya", 13, 40.2f}, {"Firda", 11, 45.3f}};
        System.out.println("Nama\tUmur\tBerat Badan");
        System.out.println("----------------------------");
        for (int i = 0; i < data.length; i++) {
            String nama = (String) data[i][0];
            int umur = (int) data[i][1];
            float berat_badan = (float) data[i][2];
            System.out.println(nama + "\t" + umur + "\t" + berat_badan);
        }
    }
}
