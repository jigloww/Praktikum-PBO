package QUIZ1;

import java.util.ArrayList;
public class Transaksi {
    private String tanggal;
    private ArrayList<ItemTransaksi> daftarItem;
    private double total;

    public Transaksi(String tanggal) {
        this.tanggal = tanggal;
        this.daftarItem = new ArrayList<>();
        this.total = 0;
    }

    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }

    public void tambahItem(Produk p, int jumlah) {
        ItemTransaksi item = new ItemTransaksi(p, jumlah);
        daftarItem.add(item);
    }

    public double hitungTotal() {
        total = 0;
        for (ItemTransaksi item : daftarItem) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void tampilNota() {
        System.out.println("===== NOTA PEMBELIAN =====");
        System.out.println("Tanggal : " + tanggal);
        System.out.println("--------------------------");
        System.out.printf("%-10s %-15s %-5s %-10s\n", "Kode", "Nama", "Qty", "Subtotal");
        for (ItemTransaksi item : daftarItem) {
            System.out.printf("%-10s %-15s %-5d Rp%.2f\n",
                    item.getProduk().getKodeProduk(),
                    item.getProduk().getNamaProduk(),
                    item.getJumlah(),
                    item.getSubtotal());
        }
        System.out.println("--------------------------");
        System.out.println("TOTAL: Rp" + hitungTotal());
        System.out.println("==========================");
    }
}