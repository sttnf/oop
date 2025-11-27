package pertemuan9.collection;

import java.util.ArrayList;
import java.util.List;

public class ListBarang {
    public static void main(String[] args) {
        List<String> barang = new ArrayList<String>();

        barang.add("Kacang");
        barang.add("Telur");
        barang.add("Apel");
        barang.add("Beras");

        for (String s : barang) {
            System.out.println(s);
        }

        barang.set(0, "Apel");
        for (String s : barang) {
            System.out.println(s);
        }

        barang.remove(2);
        for (String s : barang) {
            System.out.println(s);
        }
    }

}
