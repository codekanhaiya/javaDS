import java.util.*;

public class Array2DClass{

    private static void insert(int mtx[][]){ //O(n^2)
        int n=mtx.length;
        int m=mtx[0].length;
        System.out.println("Input all "+n*m+" values: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mtx[i][j]=sc.nextInt();        
            }
        }
    }

    private static void print(int mtx[][]){ //O(n^2)
        System.out.println("Your matrix: \n");
        for(int i=0; i<mtx.length; i++){
            for(int j=0; j<mtx[0].length; j++){
                System.out.print(mtx[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void update(int mtx[][]){ //O(1)
        System.out.print("\nGive index: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.print("Give new value: ");
        mtx[row-1][col-1]=sc.nextInt();
    }
    
    public static void main(String args[]){
        int[][] array = new int[3][2];
        insert(array);
        print(array);
        update(array);
        print(array);
    }
}