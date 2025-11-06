package pertemuan7.tugas;

/**
 * Konverter suhu dari Reamur ke Celcius
 * Rumus: C = (5/4) * R
 */
public class ReamurCelcius implements KonverterSatuan {
    String asal, tujuan;

    public ReamurCelcius() {
        this.asal = "Reamur";
        this.tujuan = "Celcius";
    }

    @Override
    public String satuanInput() {
        return this.asal;
    }

    @Override
    public String satuanOutput() {
        return this.tujuan;
    }

    @Override
    public float konversi(float in) {
        return 5f / 4 * in;
    }

    public static void main(String ar[]) {
        KonverterSatuan k1 = new ReamurCelcius();
        float temp = 80;  // titik didih air, Reamur
        System.out.println(temp + " " + k1.satuanInput() +
                " setara dengan " + k1.konversi(temp) +
                " " + k1.satuanOutput());
    }
}

