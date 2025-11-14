import java.util.ArrayList;

public class DemoPegawaiMain08 {
    public static void main(String[] args) {

        Dosen08 dosen1 = new Dosen08("19940201", "Widia, S.Kom. M.Kom", "199402");
        TenagaKependidikan08 tendik1 = new TenagaKependidikan08("19750301", "Aida, A.Md.", "Tenaga Administrasi");

        train(dosen1);
        train(tendik1);



        // System.out.println(pegawai1.nip);
        // System.out.println(pegawai1.nama);
        // pegawai1.displayInfo();

        // Dosen08 newDosen08 = (Dosen08) pegawai1;

        // System.out.println(newDosen08.nama);
        // System.out.println(newDosen08.nidn);
        // newDosen08.mengajar();

        // System.out.println(dosen1.nip);
        // System.out.println(dosen1.nama);
        // System.out.println(dosen1.nidn);
        // dosen1.mengajar();
        // System.out.println();
        // Dosen08 dosen2 = new Dosen08("19700105", "Muhammad, S.T. M.T", "197001");
        // TenagaKependidikan08 tendik1 = new TenagaKependidikan08("19750301", "Aida,
        // A.Md.", "Tenaga Administrasi");
        // TenagaKependidikan08 tendik2 = new TenagaKependidikan08("19650304", "Rika,
        // S.T.", "Tenaga Laboratorium");

        // ArrayList<Pegawai08> daftarPegawai = new ArrayList<Pegawai08>();

        // daftarPegawai.add(dosen1);
        // daftarPegawai.add(dosen2);
        // daftarPegawai.add(tendik1);
        // daftarPegawai.add(tendik2);

        // System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
        
    }

    public static void train(Pegawai08 pegawai) {
        pegawai.displayInfo(); 
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");

        if (pegawai instanceof Dosen08) {
            System.out.println("Memberikan pelatihan pedagogik");
        }
    }

}
