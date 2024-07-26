import java.util.ArrayList;
import java.util.Arrays;

public class PairSum1{
    
    private static boolean findPairSum1(ArrayList<Integer> lst, int tgt){ // O(n^2)
        for(int i=0; i<lst.size(); i++){
            for(int j=i+1; j<lst.size(); j++){
                if(lst.get(i)+lst.get(j) == tgt){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean findPairSum2(ArrayList<Integer> lst, int tgt){ // O(n) ::: but for this approach sorted array is required
        int lp = 0; 
        int rp = lst.size()-1;
        while(lp!=rp){
            //case 1
            if(lst.get(lp)+lst.get(rp) == tgt){
                return true;
            }
            //case 2
            if(lst.get(lp)+lst.get(rp) < tgt){
                lp++;
            }
            //case 3
            else{
                rp--;
            }
        }
        return false;
    }
    
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<Integer>(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7)
        );
        int target = 5;
        System.out.println("Pair is feasible: "+findPairSum1(list, target));// Brute-Force Approach
        System.out.println("Pair is feasible: "+findPairSum2(list, target));// 2-pointer Approach
    }
}