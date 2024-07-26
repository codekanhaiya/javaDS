public class BinaryStr{ // O(2^n)
    
    public static void binStrFormation(String FormedStr, int lastPlace, int noOfDigit){
        if(noOfDigit==0){
            System.out.println(FormedStr);
            return ;
        }
        if(lastPlace==0){
            binStrFormation(FormedStr+"0",0,noOfDigit-1);
            binStrFormation(FormedStr+"1",1,noOfDigit-1);
        }else{
            binStrFormation(FormedStr+"0",0,noOfDigit-1);
        }
    }

    public static void main(String arg[]){
        System.out.print("Formed String witout cosecutive 1\'s: ");
        binStrFormation(new String(""),0,5);
    }
}