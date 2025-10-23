package pertemuan5;

public class CivitasKampus {
    public static void main(String[] args) {
        Dosen d1 = new Dosen();
        Dosen d2 = new Dosen();

        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();

        d1.setNidn("1111");
        d1.setNama("Nasrul");
        d1.setGender('L');
        d1.setGelar("S.Kom, M.Kom");

        d2.setNidn("1112");
        d2.setNama("Tifany");
        d2.setGender('P');
        d2.setGelar("ST, MT");

        m1.setProdi("TI");
        m1.setSemester(3);
        m1.setNama("Eko");
        m1.setGender('L');

        m2.setNama("Maya Malahayati");
        m2.setGender('P');
        m2.setProdi("SI");
        m2.setSemester(6);

        Person ar[] = {d1, d2, m1, m2};

        for (Person a : ar) {
            System.out.println(a);
        }
    }
}
