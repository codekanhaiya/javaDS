public class BuilderStr{

    private static void stringBuilder(){ // O(n)
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch+" ");
        }
        System.out.println(sb);
    }

    private static void simpleString(){ // O(n^2)
        String ss = new String("");
        for(char ch='a'; ch<='z'; ch++){
            ss = ss+ch+" ";
        }
        System.out.println(ss);
    }

    public static void main(String arg[]){
        stringBuilder();
        simpleString();
    }
}