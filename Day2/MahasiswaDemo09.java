package Day2;

public class MahasiswaDemo09 {
    public static void main(String[] args) {
        // objek 1
        Mahasiswa09 m1 = new Mahasiswa09();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        // objek 2
        Mahasiswa09 m2 = new Mahasiswa09();
        m2.nim = "2441070";
        m2.nama = "Mochammad Tanggaq";
        m2.alamat = "Jombang, Jawa Timur";
        m2.kelas = "2D";

        // objek 3
        Mahasiswa09 m3 = new Mahasiswa09();
        m3.nim = "2441160";
        m3.nama = "Muhammad Jio Saputra";
        m3.alamat = "Lumajang, Jawa Timur";
        m3.kelas = "2D";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}
