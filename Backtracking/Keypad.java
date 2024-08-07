public class Keypad{

    final static char[][] L ={
                                {'~'}, {'a','b','c'}, {'d','e','f'},
                                {'g','h','i'}, {'j','k','l'}, {'m','n','o'},
                                {'p','q','r','s'},{'t','u','v'},{'w','x','y','z'},
                                {'*'},{'_'},{'#'}
                            };

    private static void bfs(int pos, int len, StringBuilder sb, String D){
        if(pos == len){
            System.out.println(sb.toString());
        }else{
            char[] letters = L[Character.getNumericValue(D.charAt(pos))];
            for(int i=0; i<letters.length; i++)
                bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), D);
        }
    }
    
    private static void letterCombination(String D){
        int len = D.length();
        if(len==0){
            System.out.println("");
            return;
        }
        bfs(0, len, new StringBuilder(), D);
    }

    public static void main(String arg[]){
        letterCombination("7");
        letterCombination("8");
        letterCombination("9");
        letterCombination("10");
        letterCombination("11");
    }
}