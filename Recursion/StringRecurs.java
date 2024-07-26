public class StringRecurs{ // O(n^2)

    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1))+1;
    }

    public static void main(String arg[]){
        String myStr = "Hello I am Kanhaiya.";
        System.out.println("Length of string: "+length(myStr));
    }
}