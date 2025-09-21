// arraylist ga restricted kyk array

import java.util.ArrayList;

public class two {
    public static void main(String[] args) {
        ArrayList<String> sapa = new ArrayList<>();

        sapa.add("ohayo");
        sapa.add("bonjour");
        sapa.add("nihao");
        sapa.add("apa kabar");
        sapa.add("horas");
        sapa.add("hola");

        int count = sapa.size();

        System.out.println(count);

        sapa.set(1, "anyeong");
        System.out.println(sapa.get(1));

        sapa.remove(3);
        

        for (String s : sapa) {
            System.out.println(s + "!");
        }
    }
}

// array aksesnya langsung sapa[1] 
//  kalo arraylist sapa.get(1) 

// print always use foreach