import java.util.*;
public class searchArray{

    public static int linearSearch(int numArray[]){
        System.out.print("Enter searching element: ");
        Scanner sc = new Scanner(System.in);
        int key=sc.nextInt();
        for(int i=0; i<numArray.length; i++){
            if(numArray[i]==key){
                return i+1;
            }
        }
        return -1;
    }

    public static int binarySearch(int numArray[]){
        System.out.print("Enter searching element: ");
        Scanner sc = new Scanner(System.in);
        int key=sc.nextInt();
        int first=0, last=numArray.length, mid=0;
        while(first<=last){
            mid=(first+last)/2;
            if(key==numArray[mid]){
                return mid+1;
            }else if(key<numArray[mid]){
                last=mid-1;
            }else{
                first=mid+1;
            }
        }
        return -1;
    }

    public static void main (String[] arags){
        int number[]={10,20,30,80,78,7412,-1,54,45,76};
        int flag=linearSearch(number);
        if(flag!=-1){
            System.out.println("Element is found at "+flag+" position.");
        }else{
            System.out.println("ELEMENT NOT FOUND!");
        }

        int numberCopy[]={-1,10,20,30,45,54,76,78,80,7412};  // Array should be sorted.  AND here second array is made because array can't be changed at run time.
        flag=binarySearch(numberCopy);
        if(flag!=-1){
            System.out.println("Element is found at "+flag+" position.");
        }else{
            System.out.println("ELEMENT NOT FOUND!");
        }
    }
}