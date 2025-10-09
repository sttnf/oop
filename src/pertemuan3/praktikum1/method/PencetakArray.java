package pertemuan3.praktikum1.method;

public class PencetakArray {
    public static void cetak(int[] ar1) {
        System.out.println("Cetak array interger " + ar1.length + " elemen"); //cetak
        for (int bil : ar1) {
            System.out.println(bil + " ");
        }
    }

    public static void cetak(String[] args) {
        System.out.println("Cetak array String " + args.length + " elemen"); //cetak for(String a : args){ System.out.println(a + " "); } }
    }

    public static void main(String[] args) {
        int[] array1 = {7, 3, 5, 2, 1, 6, 8, 4};
        cetak(array1);

        String[] array2 = {"fawwaz", "inaya", "hisyam", "kamila", "salman"};
        cetak(array2);
    }


}
