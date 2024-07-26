public class LgSgInArr{

    private static int large(int arr[]){
        int min = Integer.MIN_VALUE,largestValue=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>min){
                largestValue = arr[i];
                min = arr[i];
            }
        }
        return largestValue;
    }
    private static int small(int[] arr) {
        int max = Integer.MAX_VALUE,smallestValue=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<max){
                smallestValue = arr[i];
                max = arr[i];
            }
        }
        return smallestValue;
    }
    public static void main(String arg[]){
        int array[] = {110, -33, 34, 87, 1, 5, 8};
        System.out.println("largest Value: "+large(array)); 
        System.out.println("largest Value: "+small(array)); 
    }
}