import java.util.*;
public class year{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = scan.nextInt();
        boolean x = (year%4)==0;
        boolean y = (year%100)!=0;
        boolean z = (year%100==0)&&(year%400==0);
        if(x&&(y||z)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not A Leap Year");
        }
    }
}