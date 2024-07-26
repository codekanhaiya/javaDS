public class CountStr{

    private static int countLowerCaseVowel(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e'){
                count++;
            }
        }
        return count;
    }

    public static void main(String arg[]){
        String str = "Hello Engineers, How are you?";
        System.out.println("Total "+countLowerCaseVowel(str)+" lower case vowel in :\""+str+"\"");       
    }
}