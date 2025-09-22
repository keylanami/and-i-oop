public class orang {
    String id;
    String nama;

    public orang(String id, String nama){
        this.id = id;
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nama: " + nama;
    }
}
