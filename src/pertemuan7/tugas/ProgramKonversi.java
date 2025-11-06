package pertemuan7.tugas;

import java.util.Scanner;

public class ProgramKonversi {

    public static void main(String[] args) {

        int jumlahkonverter = 4, n = 0;
        KonverterSatuan konverters[] = new KonverterSatuan[jumlahkonverter];
        konverters[n++] = new CelciusFahrenheit();
        konverters[n++] = new FahrenheitCelcius();
        konverters[n++] = new CelciusReamur();
        konverters[n++] = new ReamurCelcius();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Assalamu'alaikum,");
        System.out.println("Aku adalah Konverter Besaran Suhu ...");
        System.out.println();

        while (true) {
            System.out.println("Silakan pilih nomor konverter:");
            for (int i = 0; i < konverters.length; i++) {
                System.out.println((i + 1) + ". " +
                        konverters[i].satuanInput() + " ke " +
                        konverters[i].satuanOutput());
            }

            System.out.print("Konverter pilihan anda (0 untuk QUIT) : ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan program ini.");
                System.out.println("Wassalamu'alaikum...");
                break;
            }

            if (pilihan < 1 || pilihan > jumlahkonverter) {
                System.out.println(">> Pilihan tidak valid! Silakan pilih antara 1-" +
                        jumlahkonverter);
                System.out.println();
                continue;
            }

            KonverterSatuan konverterPilihan = konverters[pilihan - 1];

            System.out.println(">> Anda pilih " + konverterPilihan.satuanInput() +
                    " ke " + konverterPilihan.satuanOutput());

            System.out.print("Masukkan besaran suhu (" +
                    konverterPilihan.satuanInput() + ") : ");
            float nilaiInput = scanner.nextFloat();

            float hasilKonversi = konverterPilihan.konversi(nilaiInput);

            System.out.println(">> " + nilaiInput + " " +
                    konverterPilihan.satuanInput() +
                    " setara dengan " + hasilKonversi + " " +
                    konverterPilihan.satuanOutput());
            System.out.println();
        }

        scanner.close();
    }
}

interface KonverterSatuan {
    public float konversi(float input);

    public String satuanInput();

    public String satuanOutput();
}

