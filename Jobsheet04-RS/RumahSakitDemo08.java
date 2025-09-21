import java.time.LocalDate;

public class RumahSakitDemo08 {
    public static void main(String[] args) {
        Pegawai08 ani = new Pegawai08("1234", "dr. Ani");
        Pegawai08 bagus = new Pegawai08("4567", "dr. Bagus");

        Pegawai08 desi = new Pegawai08("1234", "Ns. Desi");
        Pegawai08 eka = new Pegawai08("1234", "Ns. Eka");

        Pasien08 pasien1 = new Pasien08("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021 , 8 , 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021 , 9 , 11), bagus, eka);

        System.out.println(pasien1.getInfo());

        Pasien08 pasien2 = new Pasien08("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}
