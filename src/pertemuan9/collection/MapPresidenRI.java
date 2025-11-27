package pertemuan9.collection;

import java.util.Map;
import java.util.TreeMap;

public class MapPresidenRI {
    public static void main(String[] args) {
        Map<String, String> presiden = new TreeMap<String, String>();

        presiden.put("1945-1966", "Soekarno");
        presiden.put("1966-1978", "Soeharto");
        presiden.put("1978-1998", "B.J. Habibie");
        presiden.put("1998-1999", "Abdurrahman Wahid");
        presiden.put("1999-2001", "Megawati Soekarnoputri");
        presiden.put("2001-2004", "Susilo Bambang Yudhoyono");
        presiden.put("2004-2014", "Susilo Bambang Yudhoyono");
        presiden.put("2014-2019", "Joko Widodo");
        presiden.put("2019-2024", "Joko Widodo");
        presiden.put("2024-2029", "Prabowo Subianto");

        for (String tahun : presiden.keySet()) {
            String nama = presiden.get(tahun);
            System.out.println("Presiden " + nama + " berada pada tahun " + tahun);
        }

//        Menampilkan presiden yang berada pada tahun 1998
        String nama = presiden.get("1998-1999");
        System.out.println("Presiden " + nama + " berada pada tahun 1998");
    }
}
