public class LargeStr{

    private static String largest1(String arr[]){
        String str1=arr[0];
        for(int i=1; i<arr.length; i++){
            if(str1.compareTo(arr[i]) < 0){ // here arr[i]=str2 => str1.compareTo(str2)
                str1=arr[i];
            }
        }
        return str1;
    }

    private static String largest2(String arr[]){
        String str1=arr[0];
        for(int i=1; i<arr.length; i++){
            if(str1.compareToIgnoreCase(arr[i]) < 0){ // here arr[i]=str2 => str1.compareTo(str2)
                str1=arr[i];
            }
        }
        return str1;
    }

    public static void main(String arg[]){
        String fruits[] = {"Apple", "Banana", "Mango", "mango"};
        System.out.println("Largest String: "+largest1(fruits));
        System.out.println("Largest String: "+largest2(fruits));
    }
}