/**
 * 1DArrayClass
 */
import java.util.*;
public class Array1DClass {

    public static void insert(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 10 numbers:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
    }

    public static void print(int arr[]){
        System.out.print("Your marks data: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void update(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        int idx=sc.nextInt();
        System.out.print("Enter new element at index no. "+idx+": ");
        arr[idx-1]=sc.nextInt();
    }

    public static void main(String arg[]){
        int[] marks = new int[10];
        insert(marks);
        print(marks);
        update(marks);
        print(marks);
    }
}