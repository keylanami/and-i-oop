package drill;

import java.util.ArrayList;
import java.util.Scanner;

public class notsomid {
    public static void main(String[] args) {
        ArrayList<String> fwen = new ArrayList<>();

        fwen.add("Henry Li");
        fwen.add("Alice Sun");
        fwen.add("Mei");
        fwen.add("Prof. Yang");
        fwen.add("Xiang Ling");

        for (String string : fwen) {
            System.out.print(string + " ");
        }

        fwen.add("Nian Boheng");
        System.out.println("\n" + fwen.get(5));

        fwen.remove(4);
        fwen.remove(2);
        System.out.println(fwen.get(2));

        Scanner erm = new Scanner(System.in);
        String cari = erm.nextLine();

        String nama = "";
        int letak = 0;
        for(int i = 0; i < fwen.size(); i++){
            if (fwen.get(i).equals(cari)) {
                nama = fwen.get(i);
                letak = i;
            }
        }

        System.out.println(nama + " ada di index " + letak);
    }
}
