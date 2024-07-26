public class MaxSumOfSubArr{
    private static void maxSum1(int arr[]){ // O(n^3)    : Brute Force Approach
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        int len = arr.length;
        for(int i=0; i<len; i++){
            int start = i;
            for(int j=i; j<len; j++){
                int end = j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    currSum += arr[k];
                }
                if(maxSum < currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sub-Array Sum: "+maxSum);
    }
    private static void maxSum2(int arr[]){ //O(n^2)     : Prefix Array
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        int len = arr.length;
        int prefixSum[]=new int[len];
        prefixSum[0]=arr[0];
        for(int i=1; i<len; i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        for(int i=0; i<len; i++){
            int start = i;
            for(int j=i; j<len; j++){
                int end = j;
                currSum=start==0?prefixSum[end]:prefixSum[end]-prefixSum[start-1];
                if(maxSum < currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sub-Array Sum: "+maxSum);
    }
    private static void maxSum3(int arr[]){ // O(n)      : Kadane's Algo 
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        int len = arr.length;
        for(int i=0; i<len; i++){
           currSum += arr[i];
           if(currSum<0){
            currSum=0;
           }
           maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("Max Sub-Array Sum: "+maxSum);   
    }
    public static void main(String arg[]){
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSum1(array);
        maxSum2(array);
        maxSum3(array);
    }
}