import java.util.ArrayList;

public class MostFreqNumFollowKey{

    public static int mostFreq(ArrayList<Integer> list, int key){  o(n)
        int[]result = new int[1000];

        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) == key){
                result[list.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0; i<1000; i++){
            if(result[i] > max){
                max=result[i];
                ans=i+1;
            }
        }
        return ans;
    }

    public static void main(String arg[]){
        ArrayList<Integer> list1 = new ArrayList<Integer>(){{
            add(1);
            add(100);
            add(200);
            add(1);
            add(100);
        }};
        ArrayList<Integer> list2 = new ArrayList<Integer>(){{
            add(2);
            add(2);
            add(2);
            add(3);
        }};

        System.out.println("Most Frequent Numbers Following key=100 from "+list1+"= "+mostFreq(list1,100));
        System.out.println("Most Frequent Numbers Following key=2 from "+list2+"= "+mostFreq(list2,2));
    }
}