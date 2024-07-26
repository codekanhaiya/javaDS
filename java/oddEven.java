import java.util.*;
public class oddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.print(num+" is Even number.");            
        }else{
            System.out.print(num+" is odd number.");
        }
    }
}