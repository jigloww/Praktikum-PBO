package QUIZ1;

public class DemoSistemKasir {
    public static void main(String[] args) {

        Produk p1 = new Produk("P001", "Nasi Goreng", 15000);
        Produk p2 = new Produk("P002", "Es Teh", 5000);
        Produk p3 = new Produk("P003", "Mie Ayam", 12000);
        Produk p4 = new Produk("P004", "Es Jeruk", 5000);

        Transaksi t = new Transaksi("26-09-2025");

        t.tambahItem(p1, 2); 
        t.tambahItem(p2, 3);
        t.tambahItem(p4, 1);
        t.tampilNota();
    }
}

