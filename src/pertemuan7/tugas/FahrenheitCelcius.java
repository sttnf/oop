package pertemuan7.tugas;

/**
 * Konverter suhu dari Fahrenheit ke Celcius
 * Rumus: C = (F - 32) * 5/9
 */
public class FahrenheitCelcius implements KonverterSatuan {
    String asal, tujuan;

    public FahrenheitCelcius() {
        this.asal = "Fahrenheit";
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
        return (in - 32) * 5f / 9;
    }

    public static void main(String ar[]) {
        KonverterSatuan k1 = new FahrenheitCelcius();
        float temp = 212;  // titik didih air, Fahrenheit
        System.out.println(temp + " " + k1.satuanInput() +
                          " setara dengan " + k1.konversi(temp) +
                          " " + k1.satuanOutput());
    }
}

