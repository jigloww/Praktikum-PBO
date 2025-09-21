import java.util.ArrayList;
import java.time.LocalDate;

public class Pasien08 {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi08> riwayatKonsultasi;

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
        this.riwayatKonsultasi = new ArrayList<Konsultasi08>();
    }

    public void tambahKonsultasi(LocalDate tanggal, Pegawai08 dokter, Pegawai08 perawat) {
        Konsultasi08 konsultasi = new Konsultasi08();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }

    public String getInfo() {
        String info = "";
        info += "No Rekam Medis      : " + this.noRekamMedis + "\n";
        info += "Nama                : " + this.nama + "\n";

        if(!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi :\n";

            for (Konsultasi08 konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo();
            }
        }
        else {
            info += "Belum ada riwayat konsultasi";
        }

        info += "\n";

        return info;
    }
}
