public class JMain {
    public static void main(String[] args) {

        JProdusen prod = new JProdusen("Porsche", "Jerman");
        JKendaraan kendara = new JKendaraan("Messerschmitt Bf 109", 1936, prod);
        kendara.infoDasar();
        prod.infoProdusen();

        JPesawat plane = new JPesawat("Lala", 1994, prod, 250);
        plane.infoPesawat();
        plane.setKetinggian(90);
        plane.setKetinggian(300);
        plane.tembak(30);
        plane.tembak(220);
        plane.tembak(90);
        plane.tambahPeluru(100);
        plane.setKetinggian(0);
        plane.tambahPeluru(40);
        plane.tambahPeluru(5);
        

        JKendaraan kendara2 = new JKendaraan("Tiger II", 1944, prod);
        JTank teng = new JTank("lele", 1900, prod, 1);

        kendara2.infoDasar();
        prod.infoProdusen();

        teng.infoTank();
        teng.tembak();
        teng.putarMeriam(500);
        teng.tembak();

        teng.tambahAmunisi(45);
        teng.tembak();
        teng.tambahAmunisi(1);
        
        JProdusen pro = new JProdusen("Yamaha", "Jepang");
        JKendaraan kenda = new JKendaraan("Mio Gear", 2022, pro);
        kenda.infoDasar();
        pro.infoProdusen();
    }
}
