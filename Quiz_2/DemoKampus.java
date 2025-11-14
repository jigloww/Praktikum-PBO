public class DemoKampus {
    public static void main(String[] args) {

        Mahasiswa08 m = new Mahasiswa08("Tanggaq", "2441070");
        Dosen08 d = new Dosen08("Pak Yuri", "123456");
        AsistenDosen08 a = new AsistenDosen08("Tersiqo", "789100");

        System.out.println("=== Mahasiswa ===");
        m.tampilkanInfo();
        m.aktivitas();

        System.out.println("=== Dosen ===");
        d.tampilkanInfo();
        d.aktivitas();

        System.out.println("=== Asisten Dosen ===");
        a.tampilkanInfo();
        a.aktivitas();
    }
}
