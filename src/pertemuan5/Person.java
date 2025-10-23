package pertemuan5;

public class Person {
    private String nama;
    private Character gender;

    public Person() {
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Character getGender() {
        return this.gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "nama=" + this.nama + ", gender=" + this.gender + '}';
    }
}
