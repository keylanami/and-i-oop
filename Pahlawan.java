public class Pahlawan {
    private String nama;
    private int health;
    private int level;
    private Senjata weapon;

    public Pahlawan(String nama, int health, int level){
        this.nama = nama;
        this.health = health;
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public String getNama() {
        return nama;
    }


    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    
    public void equipWeapon(Senjata weapon) {
        this.weapon = weapon;
    }

    public void menyerang(){
        System.out.println(this.nama + " menyerang dengan " + weapon.getNama() + " (Power: " + weapon.getPower() + ")");

    }


}
