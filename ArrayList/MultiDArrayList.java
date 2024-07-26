import java.util.ArrayList;

public class MultiDArrayList{

    private static void print(ArrayList<ArrayList<Integer>> mainLst){  // O(n^2)
        for(int i=0; i<mainLst.size(); i++){
            ArrayList<Integer> currLst = mainLst.get(i);
            for(int j=0; j<currLst.size(); j++){
                System.out.print(currLst.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String arg[]){
        // 2D ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(10);
        lst1.add(30);
        lst1.add(50);
        lst1.add(20);
        lst1.add(80);

        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(54);
        lst2.add(85);
        lst2.add(82);
        lst2.add(65);
        lst2.add(57);

        ArrayList<Integer> lst3 = new ArrayList<>();
        lst3.add(5);
        lst3.add(8);
        lst3.add(2);
        lst3.add(5);
        lst3.add(9);

        mainList.add(lst1);
        mainList.add(lst2);
        mainList.add(lst3);

        print(mainList); // 1st way to printing Multidimensional ArrayList

        System.out.println(mainList);  // 2nd way to printing Multidimensional ArrayList
    }
}