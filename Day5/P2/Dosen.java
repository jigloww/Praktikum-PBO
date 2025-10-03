package Day5.P2; //inheritance
import Day5.P1.Pegawai;

public class Dosen extends Pegawai{
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super();
        super.nip = nip;
        super.nama = nama;
        super.gaji = gaji;
        this.nidn = nidn;
    }

    public String getAllInfo() {
        String info = "";
        info += "NIP        : " + this.nip + "\n";
        info += "Nama        : " + this.nama + "\n";
        info += "Gaji        : " + this.gaji + "\n";
        info += "NIDN        : " + this.nidn + "\n";

        return info;
    }
}
