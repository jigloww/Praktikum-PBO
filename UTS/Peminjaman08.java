package UTS;

import java.util.ArrayList;
import java.util.Date;

public class Peminjaman08 {
    private String idPinjam;
    private Anggota08 anggota;
    private ArrayList<BahanPustaka08> itemPinjaman = new ArrayList<>();
    private Date tanggalPinjam;

    public Peminjaman08(String idPinjam, Anggota08 anggota, Date tanggalPinjam) {
        this.idPinjam = idPinjam;
        this.anggota = anggota;
        this.tanggalPinjam = tanggalPinjam;
    }

    // Overloading
    public void tambahItem(BahanPustaka08 item) {
        itemPinjaman.add(item);
    }

    public void tambahItem(BahanPustaka08 item, int extraDays) {
        itemPinjaman.add(item);
        System.out.println("Item " + item.getJudul() + " dipinjam dengan tambahan hari = " + extraDays);
    }

    public void tampilkanRingkasan() {
        System.out.println("Peminjaman " + idPinjam + " oleh " + anggota + " pada " + tanggalPinjam);
        System.out.println("Item yang dipinjam:");
        for (BahanPustaka08 bp : itemPinjaman) {
            System.out.println(" - " + bp.getInfo() + " (" + bp.getLoanPeriod() + " hari)");
        }
    }
}
