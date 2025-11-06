package pertemuan7.alatmusik;

public class SuaraMusik {
    public static void main(String[] args) {
        Gitar m1 = new Gitar();
        Seruling m2 = new Seruling();
        Piano m3 = new Piano();
        Pianika m4 = new Pianika();
        m1.petik();
        m2.tiup();
        m3.tekan();
        m4.tiup();
        m4.tekan();
    }
}