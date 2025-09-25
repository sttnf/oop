import java.util.Scanner;

public class BacaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama anda? ");
        String nama = scanner.nextLine();
        System.out.println("Apa kabar " + nama + "?");
    }
}
