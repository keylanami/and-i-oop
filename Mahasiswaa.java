public class Mahasiswaa {
    private String nim, nama;
    private float ipk;

    public Mahasiswaa(String nim, String nama, float ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public void display(){
        System.out.println("- " + this.nim + " " + this.ipk + " " + this.nama);
    }

    public float getIpk() {
        return ipk;
    }

}
