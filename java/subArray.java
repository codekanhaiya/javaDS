public class subArray{
    public static void main(String[] Kanha){
        int array[]={10,20,30,40,50};
        int line=0;
        while(line<array.length){
            for(int i=0; i<array.length; i++){
                for(int j=line; j<=i; j++){
                    System.out.print(array[j]+" ");
                }
                System.out.println();
            }
            line++;
            System.out.println();
        }
    }
}