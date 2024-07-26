import java.util.*;
public class sumOfEO{
    public static void main(String[] args){
        int evenSum=0, oddSum=0;
        char opt;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter any natural number: ");
            int num = sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }
            System.out.print("Do you continue? Y/N: ");
            opt=sc.next().charAt(0);
        }while(opt=='y'||opt=='Y');
        System.out.println("Sum of all Even numbers: "+evenSum+"\nSum of all Odd numbers: "+oddSum);
    }
}