public abstract class Pengguna {
    String nama;
    String id;

    public Pengguna(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + id);
    }

    abstract void aktivitas();
}