package pertemuan2.praktikum1;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nama anda? ");
        String nama = scanner.nextLine();
        System.out.println("Apa kabar " + nama + "?");
    }
}
