import java.util.*;
public class revNum{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int reverse=0, copy=num;
        while(copy!=0){
            int digit=copy%10;
            reverse=reverse*10+digit;
            copy=copy/10;
        }
        System.out.println("Your actual number: "+num+"\nReverse: "+reverse);
    }
}