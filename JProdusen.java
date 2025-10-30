public class JProdusen {
    private String nama;
    private String negaraAsal;

    public JProdusen(String nama, String negaraAsal){
        this.nama = nama;
        this.negaraAsal = negaraAsal;
    }

    public void infoProdusen(){
        System.out.println("=== INFO DASAR KENDARAAN ===");
        System.out.println("Nama: " + this.nama);
        System.out.println("Negara Asal " + this.nama + "\n");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
