public class Sudoku{

    private static boolean isSafe(int sudoku[][], int row, int col, int digit){
        for(int i=0; i<=8; i++){ // coloumn checking
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        for(int j=0; j<=8; j++){ // row checking
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        // grid checking that is always 3X3 size
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true; // finally return true if all condition are not true
    }
    
    private static boolean sudokuSolver(int sudoku[][], int row, int col){
        if(row==9){ // base case
            return true;
        }
        //recursion
        int nextRow = row;
        int nextCol = col+1;
        if(nextCol==9){
            nextRow = row+1;
            nextCol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    

    public static void main(String ar[]){
        int sudoku[][] = new int[9][9];
        System.out.println("Is available at least one sulution: "+sudokuSolver(sudoku, 0, 0));
    }
}