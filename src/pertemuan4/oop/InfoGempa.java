package pertemuan4.oop;

public class InfoGempa {
    public static void main(String[] args) {
        Gempa g1 = new Gempa("Jepang", 7.8f);
        Gempa g2 = new Gempa("Philipina", 5.7f);
        Gempa g3 = new Gempa("Argentina", 10f);
        Gempa g4 = new Gempa("India", 10000f);

        g1.dampak();
        g2.dampak();
        g3.dampak();
        g4.dampak();
    }
}
