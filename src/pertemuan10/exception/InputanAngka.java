package pertemuan10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputanAngka {
    private static Scanner input = new Scanner(System.in);

    public static int inputAngka(String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Input harus berupa angka!");
                input.next(); // bersihkan input salah
            }
        }
    }
}