public class RumahSakit {
    private String nama;
    private Dokter[] daftarDokter;
    private int jumlahDokter;

    public RumahSakit(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahDokter() {
        return jumlahDokter;
    }

    public Dokter getDokter(int i){
        return this.daftarDokter[i];
    }

    public void tambahDokter(Dokter dokter){
        if (jumlahDokter<this.daftarDokter.length) {
            this.daftarDokter[jumlahDokter] = dokter;
            jumlahDokter++;
        }
    }

    public void tampilkanDaftarDokter() {
        System.out.println("lIST Dokter: ");

        for (Dokter dokter : daftarDokter) {
            if (dokter!=null) {
                System.out.println("- " + " " + dokter.getNama() + " " + dokter.getSpesialisasi());
                
            }
        }
    }   
}
