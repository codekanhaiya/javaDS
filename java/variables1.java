//  code for finding Average of 3 numbers

 import java.util.*;
 public class variables1{
    public static void main(String args[]){
        System.out.println("Input 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float avg = (num1+num2+num3)/3;
        System.out.println("Average: "+avg);
    }
 }