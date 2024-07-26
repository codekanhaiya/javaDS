import java.util.Arrays;

public class AnagramsStr{

    private static boolean isAnagrams(String str1, String str2){
        if(str1.length() == str2.length()){
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            char[] strArr1 = str1.toCharArray();
            char[] strArr2 = str2.toCharArray();
            Arrays.sort(strArr1);
            Arrays.sort(strArr2);
            return Arrays.equals(strArr1, strArr2);
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        String s1 = "Care";
        String s2 = "race";
        System.out.println("Are "+s1+" and "+s2+" Anagrams: "+isAnagrams(s1,s2));
    }
}