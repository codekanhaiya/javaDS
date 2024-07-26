public class QuickSort{

    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){ // base case
            return;
        }
        int pivotIdx = partition(arr,si,ei);
        quickSort(arr, si, pivotIdx-1); // left part
        quickSort(arr, pivotIdx+1, ei); // right part 
    }

    public static int partition(int arr[],int si, int ei){
        int pvtVal = arr[ei]; // consider last element as pivot
        int i = si-1; // we are standing out of the left boundary [i(like as master)]

        for(int idx=si; idx<ei; idx++){ // idx=0(in starting) and go until ei=7(assume) the idx range will we [0,6](including 0 & 6)
            if(arr[idx]<=pvtVal){
                i++;
                //swap
                int tmpVal = arr[idx];
                arr[idx] = arr[i];
                arr[i] = tmpVal;
            }
        }
        i++;
        int temp = pvtVal;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 

    public static void main(String arg[]){
        int arr[] ={6, 3, 9, 5, 2, 8, -2,8};
        int startIdx = 0;
        int endIdx  = arr.length-1;

        printArr(arr);
        quickSort(arr,startIdx,endIdx);
        printArr(arr);
    }
}