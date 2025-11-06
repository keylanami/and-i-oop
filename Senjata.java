public class Senjata {
    private String nama;
    private int power;

    public Senjata(String nama, int power){
        this.nama = nama;
        this.power = power;
    }

    public String getNama() {
        return nama;
    }

    public int getPower() {
        return power;
    }
    
    public String attack(){
       return "Senjata " + getNama() + " menyerang dengan kekuatan " + getPower();
    }

    public String attack(String jurus){ // special
        return "Senjata " + getNama() + " menggunakan jurus " + jurus + " menyerang dengan kekuatan " + (getPower() * 2);
    }

}

