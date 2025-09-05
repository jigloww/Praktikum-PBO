public class DemoKipas09 {
    public static void main(String[] args) {
        //OBJEK - OBJEK
        Kipas09 kipas1 = new Kipas09();
        kipas1.merk = "Cosmos";
        kipas1.warna = "Putih";
        kipas1.harga = 250000;              
        kipas1.ukuran = 16;
        kipas1.watt = 45;

        Kipas09 kipas2 = new Kipas09();
        kipas2.merk = "Miyako";
        kipas2.warna = "Hitam";
        kipas2.harga = 300000;
        kipas2.ukuran = 18;
        kipas2.watt = 55;

        kipas1.nyalakan();
        kipas1.tambahKecepatan(2);
        kipas1.kurangiKecepatan(1);
        kipas1.displayInfo();
        kipas1.matikan();

        kipas2.nyalakan();
        kipas2.tambahKecepatan(3);
        kipas2.tambahKecepatan(2);
        kipas2.kurangiKecepatan(4);
        kipas2.displayInfo();
        kipas2.matikan();
    }
}

