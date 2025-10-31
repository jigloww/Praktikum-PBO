package UTS;

public abstract class BahanPustaka08 {
    private String id;
    private String judul;

    public BahanPustaka08(String id, String judul) {
        this.id = id;
        this.judul = judul;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public abstract String getInfo();

    // Method yang akan dioverride
    public abstract int getLoanPeriod();
}
