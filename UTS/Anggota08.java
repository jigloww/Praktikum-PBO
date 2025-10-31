package UTS;

public class Anggota08 {
    private String idAnggota;
    private String nama;

    public Anggota08(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return nama + " (" + idAnggota + ")";
    }
}
