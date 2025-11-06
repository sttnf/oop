package pertemuan7.tugas;

/**
 * Konverter suhu dari Celcius ke Fahrenheit
 * Rumus: F = (9/5) * C + 32
 */
public class CelciusFahrenheit implements KonverterSatuan {
    String asal, tujuan;

    public CelciusFahrenheit() {
        this.asal = "Celcius";
        this.tujuan = "Fahrenheit";
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
        return 9f / 5 * in + 32;
    }

    public static void main(String ar[]) {
        KonverterSatuan k1 = new CelciusFahrenheit();
        float temp = 100;  // titik didih air, Celcius
        System.out.println("Titik didih air " + temp + " " +
                k1.satuanInput() + " setara dengan " +
                k1.konversi(temp) + " " + k1.satuanOutput());
    }
}

