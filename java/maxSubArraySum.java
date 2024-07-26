import java.util.*;
class maxSubArraySum{


    public static void generalFunc(int newNumber[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<newNumber.length; i++){
            int start=i;
            for(int j=0; j<newNumber.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    curSum+=newNumber[k];
                }
                if(maxSum<curSum){
                    maxSum=curSum;
                }
                curSum=0;
            }
        }
        System.out.println("Max Sub-array Sum: "+maxSum);
    }


    


    public static void main(String[] args){
        int numbers[] = {1,-2,6,-1,3};
        generalFunc(numbers);
    }
}