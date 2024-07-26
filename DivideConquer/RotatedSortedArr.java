public class RotatedSortedArr{
    
    public static int searchRotation(int arr[], int si, int ei, int key){  // O(log(n))
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        
        if(arr[mid]==key){ //case found
            return mid;
        }

        if(arr[si]<=arr[mid]){ //mid on L1
            if(arr[si]<=key && key <=arr[mid]){ // case(I): Left
                return searchRotation(arr,si,mid-1,key);
            }else{ // case(II): Right 
                return searchRotation(arr,mid+1,ei,key);
            }
        }else{ // mid on L2
            if(arr[mid]<=key && key<=arr[ei]){ // case(III): right
                return searchRotation(arr,mid+1,ei,key);
            }else{ // case(IV): left
                return searchRotation(arr,si,mid-1,key);
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 

    public static void main(String arg[]){
        int arr[] ={4, 5, 6, 7, 0, 1, 2, 4};
        int startIdx = 0;
        int endIdx  = arr.length-1;
        int target = 4;
        printArr(arr);
        System.out.println("Output: ["+searchRotation(arr, startIdx, endIdx, target)+"]");
    }
}