import java.util.*;
public class methods{

    public static int sum(int a, int b){
        return a+b;
    }

    public static int prod(int a, int b){
        return a*b;
    }

    public static int fact(int num){
        int fact=1;
        if(num==0){
            return 1;
        }
        while(num!=1){
            fact*=num;
            num--;
        }
        return fact;
    }

    public static int biCoffi(int n, int r){
        if(n<r){
            System.out.println("Binomial Cofficient is not possible.");
            return -1;
        }else{
            int bc = fact(n)/(fact(r)*fact(n-r));
            return bc;
        }
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static float sum(float a, float b, float c){
        return a+b+c;
    }

    public static String prime(int num){
        if(num<1){
            return "-1";
        }
        if(num==2){
            return "Prime";
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                return "Not Prime";
            }
        }
        return "Prime";
    }

    public static void rangePrime(int num){
        for(int i=1; i<=num; i++){
            boolean isPrime=true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }

    public static int binToDeci(int bin){
        int pow=0;
        int decNum=0;
        while(bin>0){
            int lastDigit=bin%10;
            decNum+=lastDigit*(int)Math.pow(2,pow);
            pow++;
            bin=bin/10;
        }
        return decNum;
    }

    public static int deciToBin(int deci){
        int bin=0;
        int pow=0;
        while(deci>0){
            int rem=deci%2;
            bin+=rem*(int)Math.pow(10,pow);
            pow++;
            deci/=2;
        }
        return bin;
    }

    public static float avg(int a, int b, int c){
        return (a+b+c)/3f;
    }

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isPalin(int num){
        int copy=num;
        int numb=0;
        while(num>0){
            int digit = num%10;
            numb=numb*10+digit;
            num/=10;
        }
        if(numb==copy){
            return true;
        }
        return false;
    }

    public static int sumDigits(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // System.out.println("Sum: "+sum(2,3));
        // System.out.println("Product: "+prod(2,-3));
        // System.out.println("Factorial: "+fact(7));
        // System.out.println("Binomial Cofficient: "+biCoffi(12,2));
        // System.out.println("Sum: "+sum(2,3,5));
        // System.out.println("Sum: "+sum(2.1f,3,1));
        // System.out.println("Number: "+prime(22));
        /* System.out.println("Prime Numbers: ");
        rangePrime(200); */
        // System.out.println("Decimal: "+binToDeci(11010));
        // System.out.println("Binary: "+deciToBin(15));
        // System.out.println("Average: "+avg(2,3,5));
        // System.out.println("Num: "+isEven(50));
        // System.out.println("Num: "+isPalin(12321));
        System.out.println("Sum of digits: "+sumDigits(21));
    }
}