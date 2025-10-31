package UTS;

public class Buku08 extends BahanPustaka08 {
    private String penulis;
    private int jumlahHalaman;
    private String penerbit;

    public Buku08(String id, String judul, String penulis, int jumlahHalaman, String penerbit) {
        super(id, judul);
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
        this.penerbit = penerbit;
    }

    @Override
    public String getInfo() {
        return "Buku [" + getId() + "] " + getJudul() + " oleh " + penulis +
               " (" + jumlahHalaman + " halaman) - " + penerbit;
    }

    @Override
    public int getLoanPeriod() {
        return 14; // 14 hari
    }
}
