public class Ular08 extends Hewan08{
    public boolean isBerbisa;

    public Ular08(boolean isBerbisa, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat);
        this.isBerbisa = isBerbisa;
    }

    @Override
    public void bergerak() {
        System.out.println("Menggerakkan otot dari segala sisi hingga membentuk lengkungan");
        System.out.println("Menentukan titik penahan seperti batang atau batu");
        System.out.println("Menggunakan sisik untuk mendorong tubuh ke depan");
    }

    @Override
    public void bernapas() {
        System.out.println("Otot tulang rusuk kontraksi, udara masuk lewat hidung");
        System.out.println("Trakea mengirimkan udara ke paru-paru");
        System.out.println("Otot tulang rusuk relaksasi, udara dikeluarkan lewat hidung");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Berbisa  : " + (this.isBerbisa ? "Ya" : "Tidak"));
    }
}
