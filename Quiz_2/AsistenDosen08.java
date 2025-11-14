public class AsistenDosen08 extends Pengguna implements IStudy, ITeach {
    public AsistenDosen08(String nama, String id) {
        super(nama, id);
    }

    public void belajar() {
        System.out.println(nama + " sedang belajar untuk asistensi.");
    }

    public void mengajar() {
        System.out.println(nama + " sedang membantu dosen mengajar di lab.");
    }

    void aktivitas() {
        belajar();
        mengajar();
    }
}