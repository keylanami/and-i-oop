import java.util.Comparator;

public class OrderByIPK implements Comparator<Mahasiswaa>{

    @Override
    public int compare(Mahasiswaa o1, Mahasiswaa o2) {
        return ((Float) o1.getIpk()).compareTo(o2.getIpk());
    }
    
}
