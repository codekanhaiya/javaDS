public class BackSubset{

    private static void findSubSets(String str, int idx, String ans){ // O(n*2^n)
        //base case
        if(ans.length()==0){
            System.out.println("NULL");
        }else{
            System.out.println(ans);
        }
        findSubSets(str,idx+1,ans); // no choice
        findSubSets(str,idx+1,ans+str.charAt(idx)); // yes
    }

    public static void main(String arg[]){
        String qus = "abc";
        String ans = "";
        findSubSets(qus, 0, ans);
    }
}