package pertemuan7.alatmusik;

public class Pianika implements Tiup, Tekan {
    @Override
    public void tiup() {
        System.out.println("Tiup Pianika pfufffffff...");
    }

    @Override
    public void tekan() {
        System.out.println("Suara Pianika net...not...net");
    }
}