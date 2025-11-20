package pertemuan9.collection;

import java.util.ArrayList;
import java.util.List;

public class ListMataKuliah {
    public static void main(String[] args) {
        //buat obj ArrayList
        List mk = new ArrayList(); //buat 3 obj matkul
        MataKuliah m1 = new MataKuliah();
        MataKuliah m2 = new MataKuliah();
        MataKuliah m3 = new MataKuliah();

        m1.setKode("001");
        m1.setNama("Bahasa Indonesia");
        m1.setSks(2);
        m2.setKode("002");
        m2.setNama("Bahasa Inggris");
        m2.setSks(2);
        m3.setKode("003");
        m3.setNama("Matematika Dasar");
        m3.setSks(4);
        //tambahkan ke ArrayList
        mk.add(m1);
        mk.add(m2);
        mk.add(m3);
        //cetak
        for (int i = 0; i < mk.size(); i++) {
            System.out.println(mk.get(i));
        }

    }
}
