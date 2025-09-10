public class Mobil08 {
    private String merek = "Rubicon";
    private int kecepatan;

    public String getMerek() {
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }
    public int getKecepatan() {
        return kecepatan;
    }
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    public void tampilkanInfo() {
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}
