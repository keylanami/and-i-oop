import java.util.ArrayList;
import java.util.Collections;

public class Mainn {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mhs = new ArrayList<>();
        mhs.add(new Mahasiswa("60707007", "Ahjin", 4));
        mhs.add(new Mahasiswa("60709007", "Junseo", 4));
        mhs.add(new Mahasiswa("60709007", "Yechan", 3));

        System.out.println("Daftar sebelum sorted ============"); 
        for (Mahasiswa mahasiswa : mhs) {
            mahasiswa.display();
        }
        
        System.out.println("Daftar Sesudah sorted ============");
        Collections.sort(mhs);
        for (Mahasiswa mahasiswa : mhs) {
            mahasiswa.display();
        }

    
    }

    // private static void tampil(ArrayList<Mahasiswa> m){
    //     for (Mahasiswa mahasiswa : m) {
    //         mahasiswa.display();
    //     }
    // }
}
