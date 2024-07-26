public class Substr{  // O(3^n)

    public static int countSbtr(String str, int len, int startIdx, int endIdx){
        if(len == 1){
            return 1;
        }
        if(len <= 0){
            return 0;
        }
        int result = countSbtr(str,len-1,startIdx+1,endIdx)+
                     countSbtr(str,len-1,startIdx,endIdx-1 )-
                     countSbtr(str,len-2,startIdx+1,endIdx-1);
        if(str.charAt(startIdx)==str.charAt(endIdx)){
            result++;
        }   
        return result;
    }
    
    public static void main(String arg[]){
        String str = "abcab";
        int len=str.length();
        System.out.println("Total number of substring that are start and end with same character of \""+str+"\": "+countSbtr(str,len,0,len-1));
    }
}