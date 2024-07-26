import java.util.ArrayList;

public class ArrayListOperations{

    private static void print(ArrayList<Integer> list){  // O(n)
        for(int i=0; i<list.size(); i++){  // size() function is used to find the size of ArrayList
            System.out.println(list.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // O(1) 
        list.add(20);
        list.add(15);
        list.add(45);

        print(list);

        System.out.println(list.get(3)+"\n"); // O(1)

        list.remove(2); // O(n)
        print(list);


        list.set(1,200); // O(n)
        print(list);

        System.out.println(list.contains(1)); // O(n)
         System.out.println(list.contains(200));
    }
}