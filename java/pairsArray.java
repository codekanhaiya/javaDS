public class pairsArray{
    public static void main(String[] Kanha){
        int array[]={10,20,30,40,50};
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                System.out.print("("+array[i]+","+array[j]+") ");
            }
            System.out.println();
        }
    }
}