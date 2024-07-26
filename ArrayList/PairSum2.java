import java.util.ArrayList;
import java.util.Arrays;

public class PairSum2{
    
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
        int bp=-1; // bp::breakinh point
        int n=lst.size();
        for(int i=0; i<n; i++){
            if(lst.get(i)>lst.get(i+1)){ // use for finding bp
                bp=i;
                break;
            }
        }
        int lp=bp+1; // smallest value
        int rp=bp; // largest value
        while(lp!=rp){
            //case:1 
            if(lst.get(lp)+lst.get(rp)==tgt){
                return true;
            }
            //case:2
            if(lst.get(lp)+lst.get(rp)<tgt){
                lp=(lp+1)%n;
            }else{
             //case:3
             rp=(n+rp-1)%n;   
            }
        }
        return false;
    }
    
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<Integer>(
            Arrays.asList(11, 15, 6, 8, 9, 10)
        );
        int target = 16;
        System.out.println("Pair is feasible: "+findPairSum1(list, target));// Brute-Force Approach
        System.out.println("Pair is feasible: "+findPairSum2(list, target));// 2-pointer Approach
    }
}