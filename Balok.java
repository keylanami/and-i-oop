public class Balok extends SegiEmpat{
    private double tinggi;

    public Balok(double tinggi, double panjang, double lebar){
        super(lebar, panjang);
        this.tinggi = tinggi;
    }

    public double getVolume(){
        double vol = 0.0;
        vol = this.tinggi *lebar * panjang;
        return vol;
    }

    @Override
    public void display(){
        System.out.println("Balok");
    }
}
