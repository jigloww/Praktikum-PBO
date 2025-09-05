public class Barang09 {
    public String kode;
    public String nama;
    public double hargaKotor = 0;
    public double diskon = 0;

    public double getHargaBersih() {
        return hargaKotor - diskon * hargaKotor;
    }

    public void displayInfo() {
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Harga Kotor     : " + hargaKotor);
        System.out.println("Diskon          : " + diskon);
        System.out.println("Harga Bersih    : " + getHargaBersih());
    }
}
