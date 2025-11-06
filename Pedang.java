public class Pedang extends Senjata {
    private int crit;

    public Pedang(String nama, int power, int crit){
        super(nama, power);
        this.crit = crit;
    }

    
    @Override
    public String attack(){
       return "Pedang " + getNama() + " menyerang dengan kekuatan " + this.crit;
    }

    public String attack(String jurus){
        return "Pedang " + getNama() + " menebas dengan " + jurus + " dengan kekuatan " + (getPower() * this.crit);
    }

    

}
