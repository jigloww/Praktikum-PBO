package QUIZ1;

public class DemoReservasi {
    public static void main(String[] args) {
        Ruangan r1 = new Ruangan("RT 01", "Teori", 30, "Tersedia");
        Mahasiswa m1 = new Mahasiswa("234176001", "Angga");
        Mahasiswa m2 = new Mahasiswa("234176002", "Zaki");
        Reservasi reservasi = new Reservasi("26-09-2025", 3, r1);
        reservasi.tambahMahasiswa(m1);
        reservasi.tambahMahasiswa(m2);
        reservasi.tampilReservasi();
    }
}
