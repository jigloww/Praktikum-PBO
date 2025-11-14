import java.util.ArrayList;

public class DemoPegawaiMain08 {
    public static void main(String[] args) {
        Dosen08 dosen1 = new Dosen08("19940201", "Widia, S.Kom. M.Kom", "199402");
        Dosen08 dosen2 = new Dosen08("19700105", "Muhammad, S.T. M.T", "197001");
        TenagaKependidikan08 tendik1 = new TenagaKependidikan08("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan08 tendik2 = new TenagaKependidikan08("19650304", "Rika, S.T.", "Tenaga Laboratorium");
        
        ArrayList<Pegawai08> daftarPegawai = new ArrayList<Pegawai08>();

        daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik1);
        daftarPegawai.add(tendik2);

        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
    }

    
    
}
