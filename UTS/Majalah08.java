package UTS;

public class Majalah08 extends BahanPustaka08 {
    private int volume;
    private int nomor;
    private int tahun;

    public Majalah08(String id, String judul, int volume, int nomor, int tahun) {
        super(id, judul);
        this.volume = volume;
        this.nomor = nomor;
        this.tahun = tahun;
    }

    @Override
    public String getInfo() {
        return "Majalah [" + getId() + "] " + getJudul() +
               " Vol." + volume + " No." + nomor + " (" + tahun + ")";
    }

    @Override
    public int getLoanPeriod() {
        return 3; // 3 hari
    }
}
