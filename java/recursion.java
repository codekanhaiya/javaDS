import java.util.*;
public class recursion{

    public static void decOrder(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        decOrder(n-1);
    }

    public static void incOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        incOrder(n-1);
        System.out.print(n+" ");
    }

    public static int factorial(int n){
        if(n<0){
            System.out.println("Invalid input!");
            return -1;
        }
        if(n==0){
            return 1;
        }
        // int fnm1=factorial(n-1); we assume that f(n-1) will being calculating.
        int fact = n*factorial(n-1);
        return fact;
    }

    public static int sumOfFirstN(int n){
        if(n<0){
            System.out.println("Invalid input!");
            return -1;
        }
        if(n==1){
            return 1;
        }
        int Snm1 = sumOfFirstN(n-1);
        int sum = n+Snm1;
        return sum;
    }

    public static int NthFibonacci(int n){
        if(n<0){
            System.out.println("Invalid input!");
            return -1;
        }
        if(n==0 || n==1){
            return n;
        }
        int fnm1=NthFibonacci(n-1);
        int fnm2=NthFibonacci(n-2);
        int num = fnm1+fnm2;
        return num;
    }

    public static boolean isSorted(int ar[], int i){ // only for decreasing order
        if(i==ar.length-1){
            return true;
        }
        if(ar[i]<ar[i+1]){  
            return false;
        }
        return isSorted(ar,i+1);
    }

    public static int firstOccur(int arr[], int key, int idx){
        if(idx==arr.length){
            return -1;
        }
        if(key==arr[idx]){
            return idx;
        }
        return firstOccur(arr,key,idx+1);
    }

    public static int lastOccur(int arr[], int key, int idx){
        if(idx==arr.length){
            return -1;
        }
        int isLastFound = lastOccur(arr,key,idx+1);
        if(isLastFound==-1 && arr[idx]==key){
            return idx;
        }
        return isLastFound;
    }

    public static int power(int num, int pwr){  // Time Complexity: O(n)
        if(pwr==0){
            return 1;
        }
        //int x^n-1 = power(num,pwr-1);
        //int x^n = x * x^n-1;
        //return x^n
        int ans=num*power(num,pwr-1);
        return ans;
    }

    public static int nonOptimizedPower(int num, int pwr){ // Time Complexity: O(n)
        if(pwr==0){
            return 1;
        }

        int halfPowerSquare=nonOptimizedPower(num,pwr/2)*nonOptimizedPower(num,pwr/2);

        if(pwr%2!=0){ // odd case
            halfPowerSquare = num * halfPowerSquare;
        }
        return halfPowerSquare;
    }

    public static int optimizedPower(int num, int pwr){ // Time Complexity: O(log(n))
        if(pwr==0){
            return 1;
        }
        int halfPower = nonOptimizedPower(num,pwr/2);    
        int halfPowerSquare= halfPower*halfPower ;

        if(pwr%2!=0){ // odd case
            halfPowerSquare = num * halfPowerSquare;
        }
        return halfPowerSquare;
    }

    public static void main(String[] args){
        int n=10;
        decOrder(n);
        incOrder(n);
        System.out.println("Factorial of "+n+": "+factorial(n));
        System.out.println("Sum of first "+n+" numbers: "+sumOfFirstN(n)); 
        System.out.println(n+"th term of Fibonacci series: "+NthFibonacci(n));

        int arr[]={8,8,3,2,1,8}, idx=0, key=8;
        System.out.println("Give array is sorted?: "+isSorted(arr,idx)); 
        System.out.println("First occurence of "+key+" is at: "+firstOccur(arr,key,idx));
        System.out.println("Last occurence of "+key+" is at: "+lastOccur(arr,key,idx));

        int p=2,q=30;
        System.out.println(p+"^"+q+" = "+power(p,q));
        System.out.println(p+"^"+q+" = "+nonOptimizedPower(p,q));
        System.out.println(p+"^"+q+" = "+optimizedPower(p,q));
    }
}