public class Mahasiswa implements Comparable<Mahasiswa>{
    private String nim, nama;
    private float ipk;

    public Mahasiswa(String nim, String nama, float ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public void display(){
        System.out.println("- " + this.nim + " " + this.ipk + " " + this.nama);
    }

    @Override
    public int compareTo(Mahasiswa o) {
        return ((Float) ipk).compareTo(o.ipk);
    }
}
