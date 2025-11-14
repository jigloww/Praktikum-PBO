public class Dosen08 extends Pengguna implements ITeach {
    public Dosen08(String nama, String id) {
        super(nama, id);
    }

    public void mengajar() {
        System.out.println(nama + " sedang mengajar mahasiswa.");
    }

    void aktivitas() {
        mengajar();
    }
}
