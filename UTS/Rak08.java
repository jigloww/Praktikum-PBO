package UTS;

import java.util.ArrayList;

public class Rak08 {
    private String kodeRak;
    private ArrayList<BahanPustaka08> daftarPustaka = new ArrayList<>();

    public Rak08(String kodeRak) {
        this.kodeRak = kodeRak;
    }

    public void tambahItem(BahanPustaka08 item) {
        daftarPustaka.add(item);
    }

    public void tampilkanIsiRak() {
        System.out.println("Isi Rak " + kodeRak + ":");
        for (BahanPustaka08 bp : daftarPustaka) {
            System.out.println(" - " + bp.getInfo());
        }
        System.out.println();
    }
}
