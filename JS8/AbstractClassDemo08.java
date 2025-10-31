public class AbstractClassDemo08 {
    public static void main(String[] args) {
        Hewan08 hewan1 = new Hewan08(10, "Rumput", "Savana");
        hewan1.cetakInfo();
        hewan1.bergerak();
        hewan1.bernapas();

        Lebah08 lebah1 = new Lebah08("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();
    }
}
