import javax.swing.plaf.synth.SynthUI;

public class JTank extends JKendaraan {
    private int kaliber;
    private int derajatRotasi;
    private int amunisi;

    public JTank(String nama, int tahunProduksi, JProdusen produsen, int amunisi){
        super(nama, tahunProduksi, produsen);
        this.amunisi = amunisi;
    }

    
    public void tambahAmunisi(int amunisi){
        this.amunisi += amunisi;
        System.out.println("Menambah Amunisi sebanyak " + amunisi + " buah");
        System.out.println("Jumlah amunisi sekarang: " + this.amunisi + " buah");
    }
    
    public void tembak(){
        if (this.amunisi > 0) {
            System.out.println("Tank menembak...");
            System.out.println("Sisa amunisi: " + (this.amunisi -1) + " buah");
            this.amunisi -= 1;
        } else {
            System.out.println("Amunisi habis, tidak bisa menembak.");
        }
    }


    public void putarMeriam(int derajat){
        this.derajatRotasi = derajat;
        if (derajat > 360) {
            int der = derajat % 360;
            this.derajatRotasi = der;
        }
        System.out.println("Memutar tank ke " + derajat + " derajat");
        System.out.println("Arah rotasi: " + getArah(this.derajatRotasi));
        
    }

    public String getArah(int derajat){
        String arah = "";
        int d = derajat % 360;
            
        if (derajat == 0 || derajat == 360 || d == 0) {
           arah = "Depan";
        } else if (derajat == 90 || d == 90) {
            arah = "Kanan";
        } else if (derajat > 0 && derajat < 90 || d > 0 && d < 90) {
            arah = "Depan Kanan";
        } else if (derajat > 90 && derajat < 180 || d > 90 && d < 180) {
            arah = "Belakang Kanan";
        } else if (derajat ==  180 || d == 180) {
            arah = "Belakang";
        } else if (derajat > 180 && derajat < 270 || d > 180 && d < 270) {
            arah = "Belakang Kiri";
        } else if (derajat == 270 || d == 270) {
            arah = "Kiri";
        } else if (derajat > 270 && derajat < 360 || d > 270 && d < 360) {
            arah = "Depan Kiri";
        }
        return arah;
    }
    
    public void infoTank(){
        System.out.println("=== INFO TANK ===");
        System.out.println("Kaliber: " + this.kaliber);
        System.out.println("Jumlah amunisi: " + this.amunisi);
        System.out.println("Derajat rotasi: " + this.derajatRotasi);
        System.out.println("Arah rotasi: " + getArah(this.derajatRotasi));
        System.out.println();
    }

}