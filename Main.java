import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inventory dataa = new inventory();
        Scanner hi = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. INPUT DATA\n2. CARI\n3. TAMPILKAN DATA\n4. UBAH DATA\n5. KELUAR");
            System.out.println("Masukkan nomor: ");
            int input = hi.nextInt();
            hi.nextLine();

            if (input == 1) {
                System.out.print("Input nama: ");
                String nama = hi.next();

                System.out.print("Input ID: ");
                String id = hi.next();

                dataa.addIdentitas(new orang(id, nama));

            } else if (input == 2) {
                System.out.println("1. By Name\n2. By ID");
                int cari = hi.nextInt();
                hi.nextLine();

                if (cari == 1) {
                    System.out.println("Cari dengan Nama");
                    String name = hi.nextLine();
                    dataa.cariNama(name);

                    hi.nextLine();
                } else if (cari == 2) {
                    System.out.print("Cari dengan ID: ");
                    String id = hi.nextLine();
                    dataa.cariID(id);

                }
    

            } else if (input == 3) {
                dataa.showData();

            } else if (input == 4) {
                System.out.println("Input ID untuk data yang diubah: ");
                String id = hi.nextLine();

                System.out.println("Input name changes: ");
                String n = hi.nextLine();
                dataa.ubahData(id, n);

            } else {
                System.out.println("Tidak valid/selesai");
                break;
            }
        }


    }
}

// public class Main {
//     public static void main(String[] args) {
//         inventory dataa = new inventory();
//         Scanner hi = new Scanner(System.in);
        
//         while (true) {
//             System.out.println("1. INPUT DATA\n2. CARI\n3. TAMPILKAN DATA\n4. UBAH DATA\n5. KELUAR");
//             System.out.print("Masukkan nomor: ");
//             int input = hi.nextInt();
//             hi.nextLine(); // buang enter

//             if (input == 1) {
//                 System.out.print("Input nama: ");
//                 String nama = hi.nextLine();

//                 System.out.print("Input ID: ");
//                 String id = hi.nextLine();

//                 dataa.addIdentitas(new orang(nama, id));

//             } else if (input == 2) {
//                 System.out.println("1. By Name\n2. By ID");
//                 int cari = hi.nextInt();
//                 hi.nextLine(); // buang enter

//                 if (cari == 1) {
//                     System.out.print("Cari dengan Nama: ");
//                     String name = hi.nextLine();
//                     dataa.cariNama(name);

//                 } else if (cari == 2) {
//                     System.out.print("Cari dengan ID: ");
//                     String id = hi.nextLine();
//                     dataa.cariID(id);
//                 }
