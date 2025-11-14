public class Main03 {
    public static void main(String[] args) {
        Senjata s1 = new Pedang("Roukanken", 50, 10);
        Senjata s2 = new Panah("Moon Bow", 30, 9);
        Senjata s3 = new MagicWand("Gohei", 40, true);


        GudangSenjata.tesSenjata(s1);
        GudangSenjata.tesSenjata(s2);
        GudangSenjata.tesSenjata(s3);

        GudangSenjata.upgradeSenjata(s1, 10);
        GudangSenjata.upgradeSenjata(s2,5);

    }
}
