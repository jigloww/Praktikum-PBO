public class TenagaKependidikan08 extends Pegawai08{
    public String kategori;

    public TenagaKependidikan08(){

    }

    public TenagaKependidikan08(String nip, String nama, String kategori) {
        super(nip, nama);
        this.kategori = kategori;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kategori: " + kategori);
    }
}
