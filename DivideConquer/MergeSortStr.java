public class MergeSortStr{

    public static void mrgSrt(String arr[], int si, int ei){ // O(nlog(n))
        if(si==ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mrgSrt(arr, si, mid);
        mrgSrt(arr, mid+1, ei);
        merge(arr, si, ei, mid);
    }

    public static void merge(String arr[], int si, int ei, int mid){
        String temp[] = new String[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int idx3 = 0;

        while(idx1<=mid && idx2<=ei){
            if(isAlphabeticalSmaller(arr[idx1], arr[idx2])){
                temp[idx3] = arr[idx1];
                idx1++;
            }else{
                temp[idx3] = arr[idx2];
                idx2++;
            }
            idx3++;
        }
        while(idx1 <= mid){
            temp[idx3++]=arr[idx1++];
        }
        while(idx2 <= ei){
            temp[idx3++]=arr[idx2++];
        }
        for(idx3=0, idx1=si; idx3<temp.length; idx1++,idx3++){
            arr[idx1] = temp[idx3];
        }
    }  

    public static boolean isAlphabeticalSmaller(String str1, String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;
    }     

    public static void printArr(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 

    public static void main(String arg[]){
        String arr[] = {"sun", "earth", "mars", "mercury"};
        printArr(arr);
        mrgSrt(arr, 0, arr.length-1);
        printArr(arr);
    }
}