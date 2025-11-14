public abstract class Senjata implements AksiSenjata {
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
    
   @Override
   public String attack() {
       return "Senjata " + getNama() + " menyerang dengan kekuatan " + getPower();
   }

  @Override
  public String attack(String jurus) {
      return "Senjata " + getNama() + " menggunakan jurus " + jurus + " menyerang dengan kekuatan " + (getPower() * 2);
  }

  @Override
  public String upgrade(int power) {
      return "Senjata " + getNama() + " telah upgraded! current power: " + (this.power += power);
  }



}

