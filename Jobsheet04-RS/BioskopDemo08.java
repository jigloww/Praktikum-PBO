public class BioskopDemo08 {
    public static void main(String[] args) {

        Film08 film1 = new Film08("Avengers - Endgame", 180, "Action");
        Film08 film2 = new Film08("Frozen II", 120, "Animation");

        Tiket08 tiket1 = new Tiket08("T001", "A12", "2025-09-25 19:00", film1);
        Tiket08 tiket2 = new Tiket08("T002", "A13", "2025-09-25 19:00", film1);
        Tiket08 tiket3 = new Tiket08("T003", "B07", "2025-09-26 16:00", film2);

        Penonton08 penonton1 = new Penonton08("Tanggaq", "0112");
        Penonton08 penonton2 = new Penonton08("Wandaa", "0113");

        penonton1.beliTiket(tiket1);
        penonton1.beliTiket(tiket2);
        penonton2.beliTiket(tiket3);
        penonton1.tampilkanTiket();
        penonton2.tampilkanTiket();

        Tiket08 cari = penonton1.cariTiket("T001");
        if (cari != null) {
            System.out.println("Tiket ditemukan:");
            cari.tampilkanDetail();
        }

        penonton1.hpsTiket("T002");
        film1.ubahJadwal();
        tiket3.ubahKursi("D05");

        System.out.println();
        System.out.println("Jumlah tiket " + penonton1.getNama() + " " + penonton1.jmlhTiket());
        System.out.println("Jumlah tiket " + penonton2.getNama() + " " + penonton2.jmlhTiket());
    }
}
