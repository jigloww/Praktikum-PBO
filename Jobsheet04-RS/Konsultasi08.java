import java.time.LocalDate;

public class Konsultasi08 {
    private LocalDate tanggal;
    private Pegawai08 dokter;
    private Pegawai08 perawat;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai08 getDokter() {
        return dokter;
    }

    public void setDokter(Pegawai08 dokter) {
        this.dokter = dokter;
    }

    public Pegawai08 getPerawat() {
        return perawat;
    }

    public void setPerawat(Pegawai08 perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal  : " + tanggal;
        info += ", Dokter   : " + dokter.getInfo();
        info += ", Perawat  : " + perawat.getInfo();
        info += "\n";

        return info;
    }
}
