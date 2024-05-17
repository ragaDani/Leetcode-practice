import java.util.ArrayList;
import java.util.List;

/**
 * kthFactor
 */
public class kthFactor {

    public static int kthFactor(int n, int k) {
        List<Integer> nList = new ArrayList<>();
        for(int i=1;i<n/2;i++){
            if(n%i==0){
                nList.add(i);
            }
        }
        nList.add(n);
        nList.forEach(System.out::print);
        if(nList.size()<k){
            return -1;
        } else {
            return nList.get(k-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(kthFactor(7,2));
        System.out.println(kthFactor(12, 3));
    }
}