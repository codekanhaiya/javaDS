public class PairsArr{
    private static void printPairs(int arr[]){ // O(n^2)
        int t=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("["+arr[i]+","+arr[j]+"]  ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs of the given Array: "+t); // t=n(n-1)/2
    }
    public static void main(String arg[]){
        int array[] = {2,4,6,8,10};
        printPairs(array);
    }
}