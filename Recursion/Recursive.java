import java.util.*;

public class Recursive{

    public static void printNto1(int n){ // Decreasing order : O(n)
        if(n==1){ // (1)base case
            System.out.println(n);
            return;
        }
        System.out.print(n+" "); // (2)work
        printNto1(n-1); // (3)inner call
    }

    public static void print1toN(int n){ // Increasing order : O(n)
        if(n==1){ // (1)base case
            System.out.println(n);
            return;
        }
        print1toN(n-1); // (3)inner call
        System.out.println(n); // (2)work
    }

    public static long factorial(int n){ // O(n)
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int SumOfN(int n){ // O(n)
        if(n==0){
            return 0;
        }
        int sum=SumOfN(n-1);
        int sumn = n+sum;
        return sumn;
    }

    public static int fibonacii(int n){ // starting from 0 to ... : O(2^n)
        if(n==0 || n==1){
            return n;
        }
        return fibonacii(n-1)+fibonacii(n-2);
    }

    public static boolean isSortArr(int arr[], int startIdx){ // checking for ascending order only. O(n)
        if(startIdx==arr.length-1){
            return true;
        }
        if(arr[startIdx]>arr[startIdx+1]){
            return false;
        }
        return isSortArr(arr, startIdx+1);
    }

    public static int firstOccur(int arr[],int key,int startIdx){ //O(n)
        if(startIdx==arr.length){
            return -1;
        }
        if(key==arr[startIdx]){
            return startIdx;
        }
        return firstOccur(arr,key,startIdx+1);
    }

    public static int lastOccur(int arr[],int key,int endIdx){ //O(n)
        if(endIdx==-1){
            return -1;
        }
        if(key==arr[endIdx]){
            return endIdx;
        }
        return lastOccur(arr,key,endIdx-1);
    }

    public static int power(int num, int pwr){ // O(n)
        if(pwr==0){
            return 1;
        }
        return num*power(num, pwr-1);
    }

    public static int optimizedPower(int num, int pwr){ // O(log(n))
        if(pwr==0){
            return 1 ;
        }
        int halfPwr=optimizedPower(num,pwr/2);
        int halfPwrSqr=halfPwr*halfPwr;
        if(pwr%2!=0){//odd
            halfPwrSqr*=num;
        }
        return halfPwrSqr;
    }


    public static void main(String arg[]){
        printNto1(50);
        print1toN(50);
        System.out.println("Factorial: "+factorial(34));
        System.out.println("Sum: "+SumOfN(100));
        System.out.println("Fibonacii: "+fibonacii(11));
        int array[] = {50,30,10,200,30,5,40};
        System.out.println("Is Array sort: "+isSortArr(array,0));
        System.out.println("First Occurence: index["+firstOccur(array,54,0)+"]");
        System.out.println("Last Occurence: index["+lastOccur(array,30,array.length-1)+"]");
        System.out.println("Power: "+power(2,10));
        System.out.println("Power: "+optimizedPower(2,9));
    }
}