import java.util.*;

public class ElementMtx{

    private static void noOfKey(int arr[][], int key){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(key==arr[i][j]){
                    count++;
                }
            }
        }
        System.out.println(key+" is total "+count+" times in this Matrix.");
    }

    public static void main(String arg[]){
        int[][] mtx = {
                    {4, 7, 8},
                    {8, 8, 7}
                  };
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Key: ");
        int key = sc.nextInt();
        noOfKey(mtx, key);
    }
}