public class NumberString{ //O(n)

    static final String numStrMap[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void numToStr(int num){ //O(n)
        if(num==0){
            return;
        }
        int digit = num%10;
        numToStr(num/10);
        System.out.print(numStrMap[digit]+" ");
    }

    public static void main(String arg[]){
        int number = 2005564;
        numToStr(number);
    }
}