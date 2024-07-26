public class BackPermutation{

    private static void findPermu(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i); // 'abcde' => 'ab'+'de' = "abde"
            String newStr = str.substring(0,i)+str.substring(i+1);
            findPermu(newStr, ans+curr);
        }
    }

    public static void main(String ar[]){
        String str = "abc", ans="";
        findPermu(str, ans);  // total n! permutations where n = numbers of char
    }
}