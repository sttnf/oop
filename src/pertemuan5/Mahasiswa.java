package pertemuan5;

public class Mahasiswa extends Person {
    private String nim;
    private String prodi;
    private Integer semester;
    private Float ipk;

    public Mahasiswa() {
    }

    public Float getIpk() {
        return ipk;
    }

    public void setIpk(Float ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "IPK: " + ipk + '\'' +
                "NIM: " + nim + '\'' +
                "PRODI: " + prodi + '\'' +
                "SEMESTER: " + semester +
                '}';
    }
}
