import java.util.*;
public class DuplicateValueInArr{
    private static boolean duplicate1(int arr[]){ // O(n^2)
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean duplicate2(int arr[]){ // O(n)
        HashSet<Integer> uniqueSet = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(uniqueSet.contains(arr[i])){
                return true;
            }else{
                uniqueSet.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String arg[]){
        int nums[]={20,-5,56,10,54,87,658,65,15};
        System.out.println("Nums-Array contains duplicate values: "+duplicate1(nums));
        System.out.println("Nums-Array contains duplicate values: "+duplicate2(nums));
    }
}