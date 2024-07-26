import java.util.*;
public class newSorting{

    public static void showArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int deciToBin(int deci){
        int bin=0;
        int pow=0;
        while(deci>0){
            int rem=deci%2;
            bin+=rem*(int)Math.pow(10,pow);
            pow++;
            deci/=2;
        }
        return bin;
    }

    public static void shreeRam(int arr[],int div,int digits){
        int sortedArr[]=new int[arr.length];
        int idx=0;
        //sorting
        for(int i=0; i<arr.length; i++){
            if((arr[i]/div)%10==0){
                sortedArr[idx++]=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if((arr[i]/div)%10==1){
                sortedArr[idx++]=arr[i];
            }
        }

        //again mapping
        for(int i=0; i<arr.length; i++){
            arr[i]=sortedArr[i];
        }
        if(digits!=0){
            digits--;
            shreeRam(arr,div*10,digits);
        }
    }

    public static void binaryArray(int arr[]){
        //digit counting
        int max=arr[0];
         for (int i = 0; i < arr.length; i++) {  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        max=deciToBin(max);
        int count=0;
        while(max!=0){
            max/=10;
            count++;
        }

        int binArr[]=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            binArr[i]=deciToBin(arr[i]);
        }
        showArray(arr);
        showArray(binArr);
        shreeRam(binArr,1,count);
        showArray(binArr);
    }

    public static void main(String[] args){
        int myArray[]={10,45,21,2,5,53,76,35,3};
        binaryArray(myArray);
    }
}