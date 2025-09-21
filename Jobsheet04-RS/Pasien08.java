public class Pasien08 {
    private String noRekamMedis;
    private String nama;

    public String getnoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Pasien08(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
    }

    public String getInfo() {
        String info = "";
        info += "No Rekam Medis      : " + this.noRekamMedis + "\n";
        info += "Nama                : " + this.nama + "\n";
        info += "\n";

        return info;
    }
}
