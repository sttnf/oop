package pertemuan2.dasar;

public class Siswa {
    public static void main(String[] args) {
        String siswa1;

        siswa1 = "Rafa Al Razzak";
        float nilai1 = 99.9F;

        String status = nilai1 >= 60 ? "Lulus" : "Tidak Lulus";
        char grade;


        if (nilai1 >= 85 && nilai1 <= 100) {
            grade = 'A';
        } else if (nilai1 >= 70 && nilai1 < 85) {
            grade = 'B';
        } else if (nilai1 >= 60 && nilai1 < 70) {
            grade = 'C';
        } else if (nilai1 >= 50 && nilai1 < 60) {
            grade = 'D';
        } else if (nilai1 >= 0 && nilai1 < 50) {
            grade = 'E';
        } else {
            grade = 'X'; // Nilai tidak valid
        }

        String predikat;

        switch (grade) {
            case 'A':
                predikat = "Sangat Memuaskan";
                break;
            case 'B':
                predikat = "Memuaskan";
                break;
            case 'C':
                predikat = "Cukup";
                break;
            case 'D':
                predikat = "Kurang";
                break;
            case 'E':
                predikat = "Sangat Kurang";
                break;
            default:
                predikat = "Tidak Ada";
                break;
        }

        System.out.println(predikat);
    }
}
