import java.util.ArrayList;
import java.util.Arrays;

public class MonotonicList{

    public static boolean isMonotonic(ArrayList<Integer> lst){ // O(n)
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<lst.size()-1; i++){
            if(lst.get(i) > lst.get(i+1))
                inc = false;
            if(lst.get(i) < lst.get(i+1))
                dec = false;
        }
        return inc || dec;
    }

    public static void main(String arg[]){
        ArrayList<Integer> list1 = new ArrayList<Integer>(
            Arrays.asList(1,2,2,3)
        );
        ArrayList<Integer> list2 = new ArrayList<Integer>(
            Arrays.asList(6,5,4,4)
        );
        ArrayList<Integer> list3 = new ArrayList<Integer>(
            Arrays.asList(1,3,2)
        );
        System.out.println("List :"+list1+" is monotonic: "+isMonotonic(list1));
        System.out.println("List :"+list2+" is monotonic: "+isMonotonic(list2));
        System.out.println("List :"+list3+" is monotonic: "+isMonotonic(list3));
    }
}