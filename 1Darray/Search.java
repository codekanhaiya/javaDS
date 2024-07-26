/**
 * Search
 */
import java.util.Scanner;
public class Search {

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14,16,18};
        System.out.print("\nEnter key element: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.err.println(key+" is found at: "+linearSrch(arr, key));
        System.err.println(key+" is found at: "+binarySrch(arr, key));
    }

    public static int binarySrch(int[] arr, int key) { // O(log(n))
        int start=0, end=(arr.length)-1, mid;
        while(start<=end){
            mid=((end-start)/2)+start;
            if(arr[mid]==key){
                return mid;
            }else if(key>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static int linearSrch(int[] arr, int key) { // O(n)
        int i=0;
        for(i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;         
            }
        }
        return -1;
    }
}