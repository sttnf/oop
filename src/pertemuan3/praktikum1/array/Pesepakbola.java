package pertemuan3.praktikum1.array;

public class Pesepakbola {
    public static void main(String[] args) {
        String[][] pemain_timnas = {{"Emil Audero", "Cremonese(ITA)"}, {"Jay Idzes", "Sassuolo(ITA)"}, {"Calvin Verdonk", "LOSC Lille(FRA)"}, {"Dean James", "Go Ahead Eagles(NED)"}, {"Kevin Diks", "Monchengladbach(GER)"}, {"Rizky Ridho", "Persija Jakarta(IDN)"}, {"Ole Romeny", "Oxford United(ENG)"},};
        System.out.println("Daftar Pemain Timnas:");
        for (int i = 0; i < pemain_timnas.length; i++) {
            System.out.println(pemain_timnas[i][0] + "\t: " + pemain_timnas[i][1]);
        }
    }
}
