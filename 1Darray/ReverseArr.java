public class ReverseArr{
    private static void revArr1(int arr[]){// T.C. = O(n) and S.C. = O(n)
        int arr2[]=new int[arr.length];
        int len=arr.length;
        for(int i=0; i<len; i++){
            arr2[i]=arr[i];
        }
        for(int i=len-1; i>-1; i--){
            arr[i]=arr2[len-1-i];
        }
    }
    private static void revArr2(int arr[]){// T.C. = O(n) and S.C. = O(1)
        int len=arr.length;
        for(int i=0; i<len/2; i++){
            arr[i]=arr[i]+arr[len-i-1];
            arr[len-i-1]=arr[i]-arr[len-i-1];
            arr[i]=arr[i]-arr[len-i-1];
        }
    }
    private static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[]={2,4,6,8,10,12,14};
        System.out.print("\nOriginal Array: ");
        printArr(array);
        revArr1(array);
        System.out.print("\nReverse Array: ");
        printArr(array);

        revArr2(array);
        System.out.print("\nReverse Array: ");
        printArr(array);
    }
}