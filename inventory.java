

import java.util.ArrayList;

public class inventory {
    
    private ArrayList<orang> identitas;

    public inventory(){
        identitas = new ArrayList<>();
    }


    public void addIdentitas(orang a){
        identitas.add(a);
    }

    public void hapus(orang a){
        identitas.remove(a);

    }

    public void cariNama(String nama){
        orang searched = null;

        for (orang o : identitas) {
           if (o.getNama().equals(nama)) {
            searched = o;
           }
        }

        System.out.println(searched + " data found");
    }

    public void cariID(String id){
        orang searchID = null;

        for (orang e : identitas) {
            if (e.getId().equals(id)) {
                searchID = e;
                System.out.println(searchID + "data found");
            }
        }
    }

    public void ubahData(String id, String n) {
    for (orang o : identitas) {
        if (o.getId().equals(id)) {
            o.setNama(n);
            System.out.println("Data Changed");

       }
    }
}




    public void showData(){
        if (identitas.isEmpty()) {
            System.out.println("Data not found");
        } else {

            for (orang orang : identitas) {
                System.out.println(orang);
            }
        }

    }
}
