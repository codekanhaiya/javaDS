public class TransposeMtx{

    private static void printMtx(int mtx[][]){ //O(n^2)
        System.out.println("Your matrix: \n");
        for(int i=0; i<mtx.length; i++){
            for(int j=0; j<mtx[0].length; j++){
                System.out.print(mtx[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    private static void transMtx(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
        int trans[][] = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                trans[j][i]=arr[i][j];
            }
        }
        printMtx(trans);
    }

    public static void main(String[] args){
        int mtx[][] = {
                        {10, 20, 30},
                        {40, 50, 60}
                      }; 
    printMtx(mtx);
    transMtx(mtx);
    }
}