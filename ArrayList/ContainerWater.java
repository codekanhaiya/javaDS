import java.util.ArrayList;

public class ContainerWater{

    private static void storeMaxWater1(ArrayList<Integer> height){ // O(n^2)
        int maxWater = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int minBoundry = Math.min(height.get(i),height.get(j));
                int containerWidth = j-i;
                int currWater = minBoundry * containerWidth;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        System.out.println("Max water: "+maxWater+" ltr.");
    }

    private static void storeMaxWater2(ArrayList<Integer> height){ // O(n)
        int maxWater=0;
        int lp = 0;
        int rp = height.size()-1;
        while(lp<rp){
            
            // calculate water area
            int minBoundry = Math.min(height.get(lp), height.get(rp));
            int containerWidth = rp-lp;
            int currWater = minBoundry * containerWidth;
            maxWater = Math.max(currWater, maxWater);

            //update both left-pointer and right-pointer
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        System.out.println("Max water: "+maxWater+" ltr.");
    }

    public static void main(String arg[]){
        ArrayList<Integer> height = new ArrayList<Integer>(){{
            add(1);
            add(8);
            add(6);
            add(2);
            add(5);
            add(4);
            add(8);
            add(3);
            add(7);
        }};
        storeMaxWater1(height); // Brute Force Approach
        storeMaxWater2(height); // 2 pointer Approach
    }
}