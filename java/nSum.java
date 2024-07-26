import java.util.*;
public class nSum{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last Natural number up to which you want sum: ");
        int num = sc.nextInt();
        int sum=0;
        for(int i=0; i<=num; i++){
            sum+=i;
        }
        System.out.println("Sum: "+sum);
    }
}