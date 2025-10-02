package pertemuan2.praktikum1;

public class Looping1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) continue;

            System.out.println("Bilangan " + i);

            if (i == 7) break;
        }
    }
}
