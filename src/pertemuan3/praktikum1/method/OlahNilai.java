package pertemuan3.praktikum1.method;

public class OlahNilai {
    //------------fungsi uji kelulusan--------------
    public static String cekLulus(int nilai) {
        String ket = (nilai >= 56) ? "Lulus" : "Gagal";
        return ket;
    } //------------fungsi uji grade-----------------

    public static char cekGrade(int n) {
        char grade;
        if (n >= 0 && n < 40) grade = 'E';
        else if (n >= 40 && n < 56) grade = 'D';
        else if (n >= 56 && n < 80) grade = 'C';
        else if (n >= 80 && n < 90) grade = 'B';
        else if (n >= 90 && n <= 100) grade = 'A';
        else grade = 'X';
        return grade;
    }

    //------------fungsi uji predikat--------------
    public static String cekPredikat(char grade) {
        String predikat;
        switch (grade) {
            case 'A':
                predikat = "Excellent";
                break;
            case 'B':
                predikat = "Good";
                break;
            case 'C':
                predikat = "Average";
                break;
            case 'D':
                predikat = "Poor";
                break;
            case 'E':
                predikat = "Bad";
                break;
            default:
                predikat = "Undefined";
        }
        return predikat;
    }

    public static void main(String[] args) {
        int[] nilai = {88, 26, 67, 92, 55, 49};

        System.out.println("Nilai\tGrade\tKeterangan\tPredikat");
        System.out.println("=========================================");
        for (int n : nilai) {
            char grade = cekGrade(n);
            String keterangan = cekLulus(n);
            String predikat = cekPredikat(grade);
            System.out.println(n + "\t" + grade + "\t" + keterangan + "\t\t" + predikat);
        }
    }
}
