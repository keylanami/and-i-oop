public class MagicWand extends Senjata {
    private boolean isEffective;

    public MagicWand(String nama, int power, boolean isEffective){
        super(nama, power);
        this.isEffective = isEffective;
    }

    @Override
     public String attack(){
       return "Magic Wand " + getNama() + " melancarkan mantra dengan kekuatan " + getPower();
    }

     public String attack(String jurus){ // special
        String res = "";
        if (this.isEffective == true) {
            res= "Magic Wand " + getNama() + " mengeluarkan mantra " + jurus + " dengan kekuatan " + (getPower() * 10);
        } else {
            res = "Magic Wand " + getNama() + " mengeluarkan mantra " + jurus + " dengan kekuatan " + (getPower() * 0.5);
        }
        return res;
    }


}
