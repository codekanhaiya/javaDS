import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFunc{

    private static void print(ArrayList<Integer> lst){ // O(n)
        for(int i=0; i<lst.size(); i++){
            System.out.print(lst.get(i)+" ");
        }
        System.out.println();
    }

    private static void revPrint(ArrayList<Integer> lst){ // O(n)
        for(int i=lst.size()-1; i>=0; i--){
            System.out.print(lst.get(i)+" ");
        }
        System.out.println();
    }

    private static void maxVal(ArrayList<Integer> lst){  // O(n)
        int max = Integer.MIN_VALUE;
        for(int i=0; i<lst.size(); i++){
            if(max < lst.get(i)){
                max=lst.get(i);
            }
        }
        System.out.println("MAX Element: "+max);
    }

    private static void minVal(ArrayList<Integer> lst){  // O(n)
        int min = Integer.MAX_VALUE;
        for(int i=0; i<lst.size(); i++){
            min = Math.min(min, lst.get(i));
        }
        System.out.println("MIN Element: "+min);
    }

    private static void swap(ArrayList<Integer> lst, int idx1, int idx2){  // O(1)
        int temp = lst.get(idx1);
        lst.set(idx1, lst.get(idx2));
        lst.set(idx2, temp); 
        print(lst); 
    }

    private static void sortInAsc(ArrayList<Integer> lst){
        Collections.sort(lst);
    }

    private static void sortInDesc(ArrayList<Integer> lst){
        Collections.sort(lst, Collections.reverseOrder());
    }

    public static void main(String arg[]){
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(45);
        lst.add(55);
        lst.add(-20);
        lst.add(54);
        lst.add(0);
        lst.add(87);
        lst.add(12);
        lst.add(-12);
        lst.add(53);
        lst.add(96);
        lst.add(82);
        lst.add(15);


        print(lst);
        revPrint(lst);

        maxVal(lst);
        minVal(lst);

        swap(lst, 2,10);

        sortInAsc(lst);
        print(lst);
        sortInDesc(lst);
        print(lst);
    }
}