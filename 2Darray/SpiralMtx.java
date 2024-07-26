public class SpiralMtx{

    private static void simplePrint(int mtx[][]){ // O(n^2)
        System.out.println("Your matrix:");
        for(int i=0; i<mtx.length; i++){
            for(int j=0; j<mtx[0].length; j++){
                System.out.print(mtx[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void spiralPrint(int mtx[][]){ //O(n^2)
        int startRow=0;
        int startCol=0;
        int endRow=mtx.length-1;
        int endCol=mtx[0].length-1;
        System.out.println("\n Spiral printing:");
        while(startRow <= endRow && startCol <=endCol){
            
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(mtx[startRow][j]+" ");
            }
            
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(mtx[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                System.out.print(mtx[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(mtx[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String arg[]){
        int mtx[][] = {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                      };
        simplePrint(mtx);
        spiralPrint(mtx);
    }
}