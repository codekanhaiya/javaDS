import java.util.*;
public class bitManipulation{

    public static void bitwiseAnd(int n1, int n2){
        System.out.println(n1+" & "+n2+" = "+(n1&n2));
    }

    public static void bitwiseOr(int n1, int n2){
        System.out.println(n1+" | "+n2+" = "+(n1|n2));
    }

    public static void onesComplement(int n1){ // 1's complement function
        System.out.println(" ~ "+n1+" = "+(~n1));
    }

    public static void bitwiseXor(int n1, int n2){
        System.out.println(n1+" ^ "+n2+" = "+(n1^n2));
    }

    public static void bitwiseLShift(int n1, int step){
        System.out.println(n1+" << "+step+" = "+(n1<<step));
    }

    public static void bitwiseRShift(int n1, int step){
        System.out.println(n1+" >> "+step+" = "+(n1>>step));
    }

    public static void bitwiseOperators(){
        System.out.println("Note: Here all arguments and return values are in Integer form. ");
        bitwiseAnd(0,1);
        bitwiseOr(1,0);
        onesComplement(5);
        bitwiseXor(0,1);
        bitwiseLShift(5,2);
        bitwiseRShift(4,1);
    }

    //*************************************************************************************

    public static void isEvenOrOddForbin(int num){
        int bitrmask=1;
        if((num & bitrmask)==1){
            System.out.println(num+": Odd binary/int number");
        }else{
            System.out.println(num+": Even binary/int number");
        }
    }

    //*************************************************************************************

    public static int getIthBit(int num, int pos){
        int bitmask=1<<pos;
        if((num&bitmask)==0){ // note we can't compare with 1 because comparitor is in Integer
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int num, int pos){  // it means we do 1 -> 1, and 0 -> 1 
        int bitmask=1<<pos;
        return num|bitmask;
    }

    public static int clearIthBit(int num, int pos){
        int bitmask=~(1<<pos);
        return num&bitmask;
    }

    public static int updateIthBit(int num, int pos, int newBit){
        // if(newBit==0){
        //     return clearIthBit(num,pos);
        // }else{
        //     return setIthBit(num,pos);
        // }
        int newNum = clearIthBit(num,pos);
        int bitmask=newBit<<pos;
        return newNum|bitmask;
    }

    public static int clearLastIBits(int num, int pos){
        int bitmask=(~0)<<pos;
        return num&bitmask;
    }

    public static int clearRangeOfBits(int num, int st, int en){
        int a = (~0)<<en+1;
        int b = (1<<st)-1;
        int bitmask = a|b;
        return num&bitmask;
    }

    //*************************************************************************************

    public static boolean isPower(int num){
        return (num&(num-1))==0;
    }

    public static int setBitCount(int num){
        int count=0;
        while(num>0){
            if((num&1)==1){ // check always LSB
                count++;
            }
            num=num>>1;
        }
        return count;
    }

    public static int fastExponent(int num, int pow){
        int ans=1;
        while(pow>0){
            if((pow&1)==1){
                ans*=num;
            }
            num*=num;
            pow=pow>>1;
        }
        return ans;
    }

    public static void main(String[] args){
        bitwiseOperators();
        isEvenOrOddForbin(3);
        System.out.println("Ith bit of binary number: "+getIthBit(10,3));
        System.out.println("Set Ith bit of binary number: "+setIthBit(10,2));
        System.out.println("Clear Ith bit of binary number: "+clearIthBit(8,3));
        System.out.println("Clear Ith bit of binary number: "+updateIthBit(8,1,1));
        System.out.println("Clear Ith bit of binary number: "+clearLastIBits(11,2));
        System.out.println("Clear Ith bit of binary number: "+clearRangeOfBits(31,1,3));
        System.out.println("Is number is a power of 2: "+isPower(15));
        System.out.println("Total set bit in number: "+setBitCount(16));
        System.out.println("Total set bit in number: "+fastExponent(2,10));
    }
}
