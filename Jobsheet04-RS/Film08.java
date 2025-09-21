public class Film08 {
    private String judul;
    private int durasi;
    private String genre;

    public Film08(String judul, int durasi, String genre) {
        this.judul = judul;
        this.durasi = durasi;
        this.genre = genre;
    }

    public void tampilkanInfo() {
        System.out.println("Judul  : " + judul);
        System.out.println("Durasi : " + durasi + " menit");
        System.out.println("Genre  : " + genre);
    }

    public void ubahJadwal() {
        System.out.println("Jadwal film " + judul + " berhasil diubah.");
    }

    public void updateDurasi(int durasiBaru) {
        this.durasi = durasiBaru;
        System.out.println("Durasi film " + judul + " diperbarui menjadi " + durasiBaru + " menit.");
    }

    public String getGenre() {
        return genre;
    }
}
