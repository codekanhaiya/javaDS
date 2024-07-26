import java.util.*;

public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int num1 = sc.nextInt();
        System.out.print("Enter B: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator: ");
        char opt = sc.next().charAt(0);
        switch(opt){
            case '+':
                System.out.print(num1+num2);
                break;
            case '-':
                System.out.print(num1-num2);
                break;
            case '*':
                System.out.print(num1*num2);
                break;
            case '/':
                System.out.print(num1/num2);
                break;
            case '%':
                System.out.print(num1%num2);
                break;
            default:
                System.out.print("Invalid operator!");
        }
    }
}