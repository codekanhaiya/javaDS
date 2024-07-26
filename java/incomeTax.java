import java.util.*;
public class incomeTax{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of your income: ");
        float income = sc.nextFloat();
        float tax;
        if(income<500000){
            tax=0;
        }else if(income>=500000 && income<1000000){
            tax=income*0.2f; // 20% tax
        }else{
            tax=income*0.3f; // 30% tax
        }
        System.out.println("Yout tax is "+ tax + " on "+income);
    }
}