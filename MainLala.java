import java.util.ArrayList;
import java.util.Scanner;

public class mainlala {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Product> rakKiri = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU PRODUK ===");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Edit Produk");
            System.out.println("3. Hapus Produk");
            System.out.println("4. Tampilkan Semua Produk");
            System.out.println("5. Tampilkan Produk Berdasarkan Jenis");
            System.out.println("6. Tampilkan Produk Berdasarkan Rentang Harga");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            switch (menu) {
                case 1 -> rakKiri.add(addProduct());
                case 2 -> editProduct();
                case 3 -> removeProduct();
                case 4 -> displayAll();
                case 5 -> displayByJenis();
                case 6 -> displayByRentangHarga();
                case 7 -> running = false;
                default -> System.out.println("Menu tidak tersedia!");
            }
        }
    }

    public static Product addProduct(){
        System.out.print("Input id produk: ");
        String id = input.next();
        System.out.print("Input nama produk: ");
        String produk = input.next();
        System.out.print("Input produsen: ");
        String produsen = input.next();
        System.out.print("Input jenis: (Makanan/Minuman/Kosmetik) ");
        String jenis = input.next();
        System.out.print("Input berat produk: ");
        int berat = input.nextInt();
        System.out.print("Input harga: ");
        int price = input.nextInt();
        System.out.print("Input lokasi rak: ");
        String lokasi = input.next();
        System.out.print("Input stok: ");
        int stok = input.nextInt();

        return new Product(id, produk, produsen, jenis, berat, price, lokasi, stok);
    }

    public static void editProduct(){
        if (rakKiri.isEmpty()) {
            System.out.println("Belum ada produk!");
            return;
        }

        displayAll();
        System.out.print("Masukkan nomor produk yang ingin diedit: ");
        int idx = input.nextInt() - 1;

        if (idx < 0 || idx >= rakKiri.size()) {
            System.out.println("Nomor tidak valid.");
            return;
        }

        Product prod = rakKiri.get(idx);
        System.out.println("Edit field:");
        System.out.println("1. Nama\n2. Produsen\n3. Berat\n4. Jenis\n5. Harga\n6. Lokasi Rak\n7. Stok");
        int choice = input.nextInt();

        switch (choice) {
            case 1 -> { System.out.print("Nama baru: "); prod.setNama(input.next()); }
            case 2 -> { System.out.print("Produsen baru: "); prod.setProdusen(input.next()); }
            case 3 -> { System.out.print("Berat baru: "); prod.setBerat(input.nextInt()); }
            case 4 -> { System.out.print("Jenis baru: "); prod.setJenis(input.next()); }
            case 5 -> { System.out.print("Harga baru: "); prod.setHarga(input.nextInt()); }
            case 6 -> { System.out.print("Lokasi Rak baru: "); prod.setLokasiRak(input.next()); }
            case 7 -> { System.out.print("Stok baru: "); prod.setStok(input.nextInt()); }
            default -> System.out.println("Pilihan tidak valid.");
        }
    }


    public static void removeProduct(){
        if (rakKiri.isEmpty()) {
            System.out.println("Belum ada produk!");
            return;
        }
        displayAll();
        System.out.print("Masukkan nomor produk yang ingin dihapus: ");
        int idx = input.nextInt() - 1;

        if (idx >= 0 && idx < rakKiri.size()) {
            rakKiri.remove(idx);
            System.out.println("Produk berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

 
    public static void displayAll(){
        if (rakKiri.isEmpty()) {
            System.out.println("Tidak ada produk.");
            return;
        }
        int no = 1;
        for (Product p : rakKiri) {
            System.out.println("Produk ke-" + no++);
            p.displayProduct();
        }
    }


    public static void displayByJenis(){
        System.out.print("Masukkan jenis produk yang dicari: ");
        String jenis = input.next();
        boolean found = false;
        for (Product p : rakKiri) {
            if (p.getJenis().equalsIgnoreCase(jenis)) {
                p.displayProduct();
                found = true;
            }
        }
        if (!found) System.out.println("Produk dengan jenis " + jenis + " tidak ditemukan.");
    }


    public static void displayByRentangHarga(){
        System.out.print("Masukkan harga minimum: ");
        int min = input.nextInt();
        System.out.print("Masukkan harga maksimum: ");
        int max = input.nextInt();

        boolean found = false;
        for (Product p : rakKiri) {
            if (p.getHarga() >= min && p.getHarga() <= max) {
                p.displayProduct();
                found = true;
            }
        }
        if (!found) System.out.println("Tidak ada produk dalam rentang harga tersebut.");
    }
}
