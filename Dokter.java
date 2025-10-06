public class Dokter {
    private String id;
    private String nama;
    private String spesialisasi;
    private String[] namaPasien;
    private int jumlahPasien;

    public Dokter(String id, String nama, String spesialisasi){
        this.id = id;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public void tambahPasien(String namaPasien) {
        if (jumlahPasien<this.namaPasien.length) {
            this.namaPasien[jumlahPasien] = namaPasien;
            jumlahPasien++;
        }
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }


    public int getJumlahPasien() {
        return jumlahPasien;
    }

    public String getIdPasien(int index){
        return namaPasien[index];
    }
}
