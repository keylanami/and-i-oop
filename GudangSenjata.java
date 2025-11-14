public class GudangSenjata {
    private GudangSenjata(){

    }

    public static <T extends AksiSenjata> void tesSenjata(T weapon){
        System.out.println(weapon.attack());
    }

    public static <T extends AksiSenjata> void upgradeSenjata(T weapon, int power){
        System.out.println(weapon.upgrade(power));
    }
}
