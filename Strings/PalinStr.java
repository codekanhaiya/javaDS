public class PalinStr{ // O(n)

    private static boolean isPalindrome(String str){
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s1 = new String("racecar");
        String s2 = new String("shree");
        String s3 = new String("madam");
        String s4 = new String("noon");
        System.out.println(s1+" is palindrome: "+isPalindrome(s1));
        System.out.println(s2+" is palindrome: "+isPalindrome(s2));
        System.out.println(s3+" is palindrome: "+isPalindrome(s3));
        System.out.println(s4+" is palindrome: "+isPalindrome(s4));
    }
}