public class SubarraysArr{
    private static void subArray(int arr[]){ //O(n^3)
        int t=0;
        int len = arr.length;
        for(int i=0; i<len; i++){
            int start=i;
            for(int j=i; j<len; j++){
                int end=j;
                System.out.print("[");
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]");
                t++;
            }
            System.out.println();
        }
        System.out.println("Total Sub-Arrays of the given Array: "+t);  // t=n(n+1)/2
    }
    public static void main(String arg[]){
        int array[] = {2,4,6,8,10};
        subArray(array);
    }
}