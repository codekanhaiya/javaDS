public class MergeSort{ // TC: O(nlog(n))  SC: O(n)

    public static void mSort(int arr[], int si, int ei){
        if(si>=ei){ // base case
            return;
        }
        int mid = ((ei-si)/2)+si;
        mSort(arr,si,mid);
        mSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int idx1 = si; // first sorted array index tracker
        int idx2 = mid+1; // second sorted array index tracker
        int idx3 = 0; // temporary array index tracker

        while(idx1<=mid && idx2<=ei){
            if(arr[idx1] < arr[idx2]){  // having lower element in first array part
                temp[idx3]=arr[idx1];
                idx1++;
            }else{                      // having lower or equal element in second array part
                temp[idx3]=arr[idx2];
                idx2++;
            }
            idx3++;
        }

        while(idx1 <= mid){ // for left over elements in first sorted part
            temp[idx3++]=arr[idx1++];
        }
        while(idx2 <= ei){  // for left over elements in second sorted part
            temp[idx3++]=arr[idx2++];
        }
        
        for(idx3=0, idx1=si; idx3<temp.length; idx1++,idx3++){ // copy tempArray to originalArray
            arr[idx1] = temp[idx3];
        }

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
        mSort(arr, startIdx, endIdx);
        printArr(arr);
    }
}