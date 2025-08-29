public class kipasP109 {
    
    // Fungsi / behavior
    public static void nyalakan(String merk) {
        System.out.println("Kipas " + merk + " dinyalakan");
    }
    
    public static void matikan(String merk) {
        System.out.println("Kipas " + merk + " dimatikan");
    }
    
    public static void tambahKecepatan(String merk, int kecepatan) {
        System.out.println("Kipas " + merk + " ditambah kecepatan ke level " + kecepatan);
    }

    public static void main(String[] args) {
        // Deklarasi dan inisialisasi 10 kipas (state/variabelnya)
        String merk1 = "Cosmos"; String warna1 = "Putih"; int harga1 = 250000;
        String merk2 = "Miyako"; String warna2 = "Hitam"; int harga2 = 200000;
        String merk3 = "Panasonic"; String warna3 = "Biru"; int harga3 = 300000;
        String merk4 = "Sharp"; String warna4 = "Abu"; int harga4 = 350000;
        String merk5 = "Maspion"; String warna5 = "Merah"; int harga5 = 270000;
        String merk6 = "National"; String warna6 = "Putih"; int harga6 = 230000;
        String merk7 = "LG"; String warna7 = "Silver"; int harga7 = 400000;
        String merk8 = "Sanken"; String warna8 = "Hitam"; int harga8 = 330000;
        String merk9 = "Polytron"; String warna9 = "Biru"; int harga9 = 280000;
        String merk10 = "Sekai"; String warna10 = "Putih"; int harga10 = 220000;
        // Pemanggilan fungsi (behavior) untuk kipas tertentu
        nyalakan(merk1);
        tambahKecepatan(merk1, 1);
        System.out.println();

        nyalakan(merk2);
        tambahKecepatan(merk2, 2);
        System.out.println();

        nyalakan(merk3);
        tambahKecepatan(merk3, 3);
        System.out.println();

        nyalakan(merk4);
        tambahKecepatan(merk4, 4);
        System.out.println();

        nyalakan(merk5);
        tambahKecepatan(merk5, 5);
        System.out.println();

        matikan(merk6);
        System.out.println();
        matikan(merk7);
        System.out.println();
        matikan(merk8);
        System.out.println();
        matikan(merk9);
        System.out.println();
        matikan(merk10);
        System.out.println();
    
    }
}
