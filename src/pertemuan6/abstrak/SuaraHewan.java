package pertemuan6.abstrak;

public class SuaraHewan {
    public static void main(String[] args) {
        Hewan tom = new Kucing();
        Hewan milo = new Anjing();
        Hewan shaun = new Kambing();

        Hewan[] suara = {
                tom, milo, shaun
        };

        for (Hewan h : suara) {
            h.bersuara();
        }
    }
}
