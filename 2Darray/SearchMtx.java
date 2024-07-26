import java.util.*;

public class SearchMtx{

    private static void search1(int arr[][],int key){ //O(n^2)
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(key == arr[i][j]){
                    System.out.println(key+" is found at index: ["+(i+1)+"]["+(j+1)+"]");
                    flag=true;
                    break;
                }
            }
        }
        if(flag==false){
            System.out.println(key+" is not found anywhere.");
        }

    }

    private static void search2(int arr[][], int key){ //O(n) or O(log(n)) : mtx must be sorted both column and row wise
        boolean flag = false;
        int row=0;
        int col=arr[0].length-1;
        while(row < arr.length && col>=0){
            if(key == arr[row][col]){
                System.out.println(key+" is found at index: ["+(row+1)+"]["+(col+1)+"]");
                flag = true; 
                break;    
            }else if(key < arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        if(flag==false){
            System.out.println(key+" is not found anywhere.");
        }
    }

    public static void main(String arg[]){
        int mtx[][] = {
                        {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}
                      }; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the key: ");
        int key = sc.nextInt();
        search1(mtx,key); 
        search2(mtx,key);
    }
}