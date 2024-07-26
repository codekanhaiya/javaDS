import java.util.*;
public class prime{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();
        boolean isPrime=true;
        
        if(num<=2&&num>=0){
            isPrime=true;
        }else{
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(num<0){
            System.out.println("This is negative.");
        }else if(isPrime==true){
            System.out.println(num+" is a prime number.");
        }else{
            System.out.println(num+" is not a prime number.");
        }
    }
}