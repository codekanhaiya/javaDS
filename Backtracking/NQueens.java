public class NQueens{

    private static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void nQueens(char board[][], int row){
        if(row == board.length){ //row
            printBoard(board);
            return;
        }
        for(int j=0; j<board.length;j++){ //coloumn loop
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nQueens(board, row+1);
                board[row][j]='X';
            }
        }
    }
    private static boolean isSafe(char board[][], int row, int col){
        for(int i=row-1; i>=0; i--){ // vertical up
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0&&j>=0; i--,j--){ // diagonal left-up
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1; i>=0&&j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void main(String arg[]){
        int queen = 5;
        char board[][]=new char[queen][queen];
        nQueens(board, 0);
    }
}