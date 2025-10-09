package Day6;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Objek dari class Dosen dibuat");
    }

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
        System.out.println("Objek dari class Dosen dibuat melalui constructor berparameter");
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "NIDN  : " + nidn + "\n";
        return info;
    }
}
