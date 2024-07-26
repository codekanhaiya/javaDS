public class CompressStr{

    private static String compress1(String str){ // O(n^2)
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;
    }

    private static String compress2(String str){ // O(n)
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count>1){
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }

    public static void main(String arg[]){
        String str = "aaabbcccaaaaaagdd";
        System.out.println("Compressed String: "+compress1(str));
        System.out.println("Compressed String: "+compress2(str));
    }
}