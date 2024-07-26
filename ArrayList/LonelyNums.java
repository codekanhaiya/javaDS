import java.util.ArrayList;
import java.util.Collections;

public class LonelyNums{

    public static ArrayList<Integer> findLonely(ArrayList<Integer> lst){
        Collections.sort(lst);
        ArrayList<Integer> lonelyLst = new ArrayList<>();
        for(int i=1; i<lst.size()-1; i++){
            if(lst.get(i-1)+1 < lst.get(i) && lst.get(i)+1 < lst.get(i+1)){
                lonelyLst.add(lst.get(i));
            }
        }
        if(lst.size() == 1){
            lonelyLst.add(lst.get(0));
        } 
        if(lst.size() > 1){
            if(lst.get(0)+1 < lst.get(1)){
                lonelyLst.add(lst.get(0));
            }
            if(lst.get(lst.size()-2)+1 < lst.get(lst.size()-1)){
                lonelyLst.add(lst.get(lst.size()-1));
            }
        }
        return lonelyLst;
    }

    public static void main(String arg[]){
        ArrayList<Integer> list1 = new ArrayList<Integer>(){{
            add(10);
            add(6);
            add(5);
            add(8);
        }};
        ArrayList<Integer> list2 = new ArrayList<Integer>(){{
            add(1);
            add(3);
            add(5);
            add(3);
        }};

        System.out.println("Lonely nums list from "+list1+"= "+findLonely(list1));
        System.out.println("Lonely nums list from "+list2+"= "+findLonely(list2));
    }
}