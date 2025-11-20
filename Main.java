public class Main {
    public static void main(String[] args) {
        Kurir k1 = new Kurir("Dudi", "Bojongsoang", "0812123222", "Cikoneng-Ciwastra");
        Kurir k2 = new Kurir("Riki", "Cikoneng", "0811123212", "Setiabudi");


        Penjaga penjaga = new Penjaga("Rita", "Cikawalo", "085723456", "Pagi");

        Order item1 = new Order("A001", "PT Sumber Makmur", "Hand Sanitizer", 10, 20000, "Sukajadi");
        Order item2 = new Order("A002", "PT Sumber Makmur", "Masker Wangi", 100, 1500, "Sukajadi 2");

        Preorder po1 = new Preorder("B001", "PT Sumber Makmur", "Hair Mask", 2, 50000, "25 November 2023", 25000);

        System.out.println("Invoice untuk setiap pemesanan");
        item1.invoice();
        item2.invoice();
        po1.invoice();

        penjaga.addOrder(item1.getIdOrder());
        penjaga.addOrder(item2.getIdOrder());
        penjaga.addOrder(po1.getIdOrder());

        k1.addOrder(item1.getIdOrder());
        k1.addOrder(item2.getIdOrder());
        k2.addOrder(po1.getIdOrder());

        System.out.println("Karyawan toko: " + penjaga.getNamaPenjaga());
        penjaga.displayOrder();

        System.out.println("Kurir: " + k1.getNamaKurir());
        System.out.println("Wilayah Antar: " + k1.getWilayahAntar());
        k1.displayOrder();

        System.out.println("Kurir: " + k2.getNamaKurir());
        System.out.println("Wilayah Antar: " + k2.getWilayahAntar());
        k2.displayOrder();
    }
}
