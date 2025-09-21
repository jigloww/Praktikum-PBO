import java.util.ArrayList;

public class Penonton08 {
    private String nama;
    private String idPenonton;
    private ArrayList<Tiket08> daftarTiket;

    public Penonton08(String nama, String idPenonton) {
        this.nama = nama;
        this.idPenonton = idPenonton;
        this.daftarTiket = new ArrayList<>();
    }

    public void beliTiket(Tiket08 t) {
        daftarTiket.add(t);
        System.out.println(nama + " berhasil membeli tiket " + t.getIdTiket());
    }

    public void tampilkanTiket() {
        if (daftarTiket.isEmpty()) {
            System.out.println(nama + " belum memiliki tiket.");
        } else {
            System.out.println("Tiket milik " + nama + ":");
            for (Tiket08 t : daftarTiket) {
                t.tampilkanDetail();
            }
        }
    }

    public void hpsTiket(String idTiket) {
        Tiket08 tiketDihapus = null;
        for (Tiket08 t : daftarTiket) {
            if (t.getIdTiket().equals(idTiket)) {
                tiketDihapus = t;
                break;
            }
        }
        if (tiketDihapus != null) {
            daftarTiket.remove(tiketDihapus);
            System.out.println("Tiket " + idTiket + " berhasil dibatalkan.");
        } else {
            System.out.println("Tiket dengan ID " + idTiket + " tidak ditemukan.");
        }
    }

    public Tiket08 cariTiket(String idTiket) {
        for (Tiket08 t : daftarTiket) {
            if (t.getIdTiket().equals(idTiket)) {
                return t;
            }
        }
        return null;
    }

    public int jmlhTiket() {
        return daftarTiket.size();
    }

    public String getNama() {
        return nama;
    }
}
