public class Tiket08 {
    private String idTiket;
    private String kursi;
    private String jadwal;
    private Film08 film;

    public Tiket08(String idTiket, String kursi, String jadwal, Film08 film) {
        this.idTiket = idTiket;
        this.kursi = kursi;
        this.jadwal = jadwal;
        this.film = film;
    }

    public void tampilkanDetail() {
        System.out.println("===== Detail Tiket =====");
        System.out.println("ID Tiket : " + idTiket);
        System.out.println("Kursi    : " + kursi);
        System.out.println("Jadwal   : " + jadwal);
        System.out.println("Film     : ");
        film.tampilkanInfo();
        System.out.println("========================\n");
    }

    public void ubahKursi(String kursiBaru) {
        this.kursi = kursiBaru;
        System.out.println("Kursi tiket " + idTiket + " diubah menjadi " + kursiBaru);
    }

    public void ubahJadwal(String jadwalBaru) {
        this.jadwal = jadwalBaru;
        System.out.println("Jadwal tiket " + idTiket + " diubah menjadi " + jadwalBaru);
    }

    public Film08 getFilm() {
        return film;
    }

    public String getIdTiket() {
        return idTiket;
    }
}
