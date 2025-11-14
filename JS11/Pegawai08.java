public class Pegawai08 {
    public String nip;
    public String nama;

    public Pegawai08(){

    }

    public Pegawai08(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void displayInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
    }
}