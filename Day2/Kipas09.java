public class Kipas09 {
    public String merk;
    public String warna;
    public int harga;
    public int ukuran;
    public int watt;
    public int kecepatan = 0;
    public boolean status = false;

    public void nyalakan() {
        status = true;
        System.out.println(merk + " berhasil dinyalakan.");
    }

    public void matikan() {
        status = false;
        kecepatan = 0; 
        System.out.println(merk + " berhasil dimatikan.");
        System.out.println();
    }

    public int tambahKecepatan(int increment) {
        if (status) {
            kecepatan += increment;
            System.out.println(">   Menambah Kecepatan");
            System.out.println("Kecepatan sekarang: " + kecepatan);
        } else {
            System.out.println("Kipas harus dinyalakan dulu!");
        }
        return kecepatan;
    }

    public int kurangiKecepatan(int decrement) {
        if (status) {
            kecepatan -= decrement;
            if (kecepatan < 0) kecepatan = 0;
            System.out.println(">   Mengurangi kecepatan");
            System.out.println("Kecepatan sekarang: " + kecepatan);
        } else {
            System.out.println("Kipas harus dinyalakan dulu!");
        }
        return kecepatan;
    }

    public void displayInfo() {
        System.out.println("Merk     : " + merk);
        System.out.println("Warna    : " + warna);
        System.out.println("Harga    : " + harga);
        System.out.println("Ukuran   : " + ukuran + " inci");
        System.out.println("Daya     : " + watt + " watt");
        System.out.println("Status   : " + (status ? "Nyala" : "Mati"));
        System.out.println("Kecepatan: " + kecepatan);
    }
}

// FINISH