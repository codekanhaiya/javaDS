import java.util.*;
public class array{

    public static void creation(int numArray[]){
        System.out.println("Enter 10 any numbers in array: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<numArray.length; i++ ){
            numArray[i]=sc.nextInt();
        }
    }

    public static void print(int numArray[]){
        System.out.print("Your Array: ");
        for(int i=0; i<numArray.length; i++ ){
            System.out.print(numArray[i]+" ");
        }
    }

    public static void update(int numArray[]){
        System.out.print("\n\nGive position: ");
        Scanner sc=new Scanner(System.in);
        int pos=sc.nextInt();
        System.out.print("Enter new element: ");
        numArray[pos-1]=sc.nextInt();
        print(numArray);
    }

    public static void main (String[] arags){
        int number[]=new int[10];
        creation(number);
        print(number);
        update(number);
    }
}