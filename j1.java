import java.util.ArrayList;
import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        ArrayList<String> daftar = new ArrayList<>();
        Scanner hi = new Scanner(System.in);

        String inp = hi.nextLine();
        while (!inp.contains("-")) {
            daftar.add(inp);
        }

        for (String list : daftar) {
            System.out.println(list);
        }
    }
}
