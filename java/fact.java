import java.util.*;
public class fact{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        long fact=1;
        if(num<0){
            System.out.println("Factorial is not possible.");
        }else{
            for(int i=num; i!=0; i--){
                fact*=i;
            }
            System.out.println("Factorial: "+fact);
        }
    }
}