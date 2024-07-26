import java.util.*;
public class largeSmallArray{
    public static void main(String args[]){
        int[] array={10,20,30,898,-11,-4,656,-1,785,-121,87,5621,632};
        int smallest=Integer.MAX_VALUE;  // + Infinity Value
        int largest=Integer.MIN_VALUE;   // - Infinity value
        for(int i=0; i<array.length; i++){
            if(smallest>array[i]){
                smallest=array[i];
            }
            if(largest<array[i]){
                largest=array[i];
            }
        }
        System.out.println("Smallest value in array: "+smallest+"\nLargest value in array: "+largest);
    }
}