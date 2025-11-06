public class Panah extends Senjata{
    private double rangeBonus;

    public Panah(String nama, int power, double rangeBonus){
        super(nama, power);
        this.rangeBonus = rangeBonus;
    }

    @Override
    public String attack(){
       return "Panah " + getNama() + " menembakkan anak panah dengan kekuatan " + getPower();
    }

    public String attack(String jurus){ // special
        return "Senjata " + getNama() + " menggunakan jurus " + jurus + " menyerang dengan kekuatan " + (getPower() * this.rangeBonus);
    }

}
