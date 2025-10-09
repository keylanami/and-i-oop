import java.util.ArrayList;

public class Penginapan {
    private String nama;
    private String alamat;
    private ArrayList<Tamu> tm;

    public Penginapan(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.tm = new ArrayList<>();
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNama() {
        return nama;
    }


    public void catatMasuk(Tamu tamu){
        tm.add(tamu);
        System.out.println(tamu.getNama() + " masuk ke penginapan " + this.nama);
    }

    public void catatKeluar(Tamu tamu){
        tm.remove(tamu);
        System.out.println(tamu.getNama() + " keluar dari penginapan " + this.nama);
    }

    public void tampilkanDaftarTamu(){
        for (Tamu tamu : tm) {
            System.out.println("- "+ tamu.getNama() + " (" + tamu.getDurasiMenginap() + " hari)");
        }
    }


}
