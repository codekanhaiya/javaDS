public class BackArr{

    private static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void changeArr(int arr[], int i, int val){  // both T.C. & S.C. = O(n) 
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1); //fnx call step
        arr[i]=arr[i]-2; //backtracking step
    }

    public static void main(String ks[]){
        int arr[] = {1, 2, 3, 4, 5};
        printArr(arr);
        changeArr(arr, 0, 10);
        printArr(arr);
    }
}