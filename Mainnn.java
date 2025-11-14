import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Mainnn {
    public static void main(String[] args) {
        ArrayList<Mahasiswaa> mh = new ArrayList<>();
        mh.add(new Mahasiswaa("60070707", "Sunghoon", 3));
        mh.add(new Mahasiswaa("70050090", "Chenle", 4));
        mh.add(new Mahasiswaa("70050400", "Jeno", 2));

        System.out.println("Daftar Mahasiswa sebelum ipk di-sort");
        for (Mahasiswaa mahasiswaa : mh) {
            mahasiswaa.display();
        }

        Comparator<Mahasiswaa> byIPK = new OrderByIPK();
        Collections.sort(mh, byIPK);
        System.out.println("Daftar Mahasiswa sesudah sorted");
        for (Mahasiswaa mahasiswaa: mh) {
            mahasiswaa.display();
        }
    }

}
