package UTS;

import java.util.Date;

public class PerpustakaanDemo08 {
    public static void main(String[] args) {
        Anggota08 a1 = new Anggota08("A001", "Mochammad Tanggaq");

        Buku08 b1 = new Buku08("B001", "Pemrograman Java", "Rafif", 300, "PT Gramedia");
        Majalah08 m1 = new Majalah08("M001", "Technical Analysis", 10, 3, 2025);
        Buku08 b2 = new Buku08("B002", "Basis Data Lanjut", "Tersiqo", 250, "PT Nusa Jaya");
        Majalah08 m2 = new Majalah08("M002", "Fahion Terkini", 11, 4, 2023);

        Rak08 rakA = new Rak08("A");
        rakA.tambahItem(b1);
        rakA.tambahItem(m1);
        Rak08 rakB = new Rak08("B");
        rakB.tambahItem(b2);
        rakB.tambahItem(m2);

        rakA.tampilkanIsiRak();
        rakB.tampilkanIsiRak();

        Peminjaman08 p1 = new Peminjaman08("P0001", a1, new Date());
        p1.tambahItem(b1);
        p1.tambahItem(m1, 2); // method overloading

        System.out.println();
        p1.tampilkanRingkasan();

        System.out.println("\nCek polymorphism:");
        BahanPustaka08 bp = b1;
        System.out.println(bp.getInfo());
        System.out.println();
    }
}
