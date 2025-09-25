package Jurnal2;
import java.util.ArrayList;
import java.util.Scanner;

public class MainLele {
    static ArrayList<Integer> daftarNilaiA = new ArrayList<>();
    static ArrayList<Integer> daftarNilaiB = new ArrayList<>();
    static ArrayList<Integer> daftarNilaiC = new ArrayList<>();
    static ArrayList<Integer> totalAllThree = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner ih = new Scanner(System.in);
        int dataa;

        while (true) {
            System.out.println("\nLihat data kelas berapa?\n1. Kelas A\n2. Kelas B\n3. Kelas\n4. Total Average Semua C\n0. Keluar");
            dataa = ih.nextInt();

            if (dataa == 4) {
                totalin();
            }

            if (dataa == 0) {
                System.out.println("Program selesai.");
                break;
            }

            ArrayList<Integer> target = pilihkelas(dataa);
            if (target == null) {
                System.out.println("Kelas tidak ditemukan!");
                continue;
            }

            System.out.println("1. Lihat daftar Nilai\n2. Rata-rata\n3. Highest Score\n4. Lowest Score\n5. Input Nilai");
            int milih = ih.nextInt();

            switch (milih) {
                case 1:
                    lihatDaftarNilai(target);
                    break;
                
                case 2:
                    if (target.isEmpty()) {
                        System.out.println("Data kosong, tidak bisa hitung rata-rata.");
                    } else {
                        System.out.println("Average: " + average(target));
                    }
                    break;

                case 3:
                    if (target.isEmpty()) {
                        System.out.println("Data kosong, tidak ada nilai tertinggi.");
                    } else {
                        System.out.println("Highest Score: " + highest(target));
                    }
                    break;

                case 4:
                    if (target.isEmpty()) {
                        System.out.println("Data kosong, tidak ada nilai terendah.");
                    } else {
                        System.out.println("Lowest Score: " + lowest(target));
                    }
                    break;
                
                case 5:
                    while (true) {
                        System.out.print("Input nilai (ketik -1 untuk keluar): ");
                        int nilaiBaru = ih.nextInt();
                        
                        if (nilaiBaru == -1) {
                            break;
                        }
                        
                        target.add(nilaiBaru);
                        System.out.println("Score added");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public static ArrayList<Integer> pilihkelas(int pilihan) {
        switch (pilihan) {
            case 1: return daftarNilaiA;
            case 2: return daftarNilaiB;
            case 3: return daftarNilaiC;
            default: return null;
        }
    }

    public static void totalin(){
        int sums = 0;
        
        totalAllThree.addAll(daftarNilaiA);
        totalAllThree.addAll(daftarNilaiB);
        totalAllThree.addAll(daftarNilaiC);

        for (Integer i : totalAllThree) {
            sums += i;
        }

        int count = sums /totalAllThree.size();
        System.out.println(count);
    }

    public static void lihatDaftarNilai(ArrayList<Integer> daftarNilai) {
        if (daftarNilai.isEmpty()) {
            System.out.println("No data");
        } else {
            System.out.println("Daftar nilai: " + daftarNilai);
        }
    }

    public static double average(ArrayList<Integer> daftarNilai) {
        int sum = 0;
        for (int n : daftarNilai) {
            sum += n;
        }
        return (double) sum / daftarNilai.size();
    }

    public static Integer highest(ArrayList<Integer> daftarNilai) {
        int high = daftarNilai.get(0);
        for (int n : daftarNilai) {
            if (n > high) {
                high = n;
            }
        }
        return high;
    }

    public static Integer lowest(ArrayList<Integer> daftarNilai) {
        int low = daftarNilai.get(0);
        for (int n : daftarNilai) {
            if (n < low) {
                low = n;
            }
        }
        return low;
    }
}
