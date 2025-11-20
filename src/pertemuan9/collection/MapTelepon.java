package pertemuan9.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTelepon {
    public static void main(String[] args) {
        Map<String, String> telp = new HashMap<String, String>();
        telp.put("Budi", "7871234");
        telp.put("Ani", "7874321");
        telp.put("Dewi", "7877777");
        System.out.println("No Telp Budi " + telp.get("Budi"));
        for (String nama : telp.keySet()) {
            String no = telp.get(nama);
            System.out.println("Siswa " + nama + " teleponnya " + no);
        }
    }
}