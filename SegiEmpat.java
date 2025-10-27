public class SegiEmpat {
    protected double panjang, lebar;

    public SegiEmpat(double panjang, double lebar){
        this.lebar = lebar;
        this.panjang = panjang;
    }

    public double getLuas(){
        double luas = 0;
        luas = this.lebar * this.panjang;
        return luas;

    }

    public void display(){
        System.out.println("Jenis bentuk segi empat: ");
    }

}