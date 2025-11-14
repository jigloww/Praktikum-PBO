public class Mahasiswa08 extends Pengguna implements IStudy {
    public Mahasiswa08(String nama, String id) {
        super(nama, id);
    }

    public void belajar() {
        System.out.println(nama + " sedang belajar di kelas.");
    }

    void aktivitas() {
        belajar();
    }
}
