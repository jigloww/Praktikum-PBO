public class Mobil08 {
    private String merek;
    private int kecepatan;

    public Mobil08(String merek) {
        this.merek = merek;
    }
    public String getMerek() {
        return merek;
    }
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    public void tampilkanInfo() {
        System.out.println("Merk: " + merek);
    }
}
