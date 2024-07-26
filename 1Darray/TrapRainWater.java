public class TrapRainWater{

    
    public static void main(String arg[]){ // O(n)
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped Water: "+trpWater(height));
    }

    public static int trpWater(int[] arr) {
        int len = arr.length;
        //calculate left max boundary - array
        int leftMax[]=new int[len];
        leftMax[0]=arr[0];
        for(int i=1; i<len; i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }

        //calculate right max boundary - array
        int rightMax[]=new int[len];
        rightMax[len-1]=arr[len-1];
        for(int i=len-2; i>=0; i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }

        int trappedWater=0;
        //loop
        for(int i=0; i<len; i++){
            //waterlevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //trappedWater = waterLevel - height[i]
            trappedWater+=waterLevel-arr[i];    
        }
        return trappedWater;
    }
}