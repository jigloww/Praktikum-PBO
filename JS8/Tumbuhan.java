public abstract class Tumbuhan {
    public double tinggi;
    public String jenisDaun;
    public String habitat;
    public int umur;

    public abstract void tumbuh();

    public abstract void berfotosintesis();

    public void bertambahUmur() {
        System.out.println("Bertambah umur");
    }
}
