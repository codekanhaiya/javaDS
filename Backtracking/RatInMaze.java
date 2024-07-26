public class RatInMaze{

    private static void printSol(int sol[][]){
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol.length; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    private static boolean isSafe(int maze[][], int x, int y){
        //if(x,y outside maze) return false
        return(x >= 0 && x < maze.length
               && y >= 0 && y < maze.length && maze[x][y] == 1 );
    }
    
    private static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]){
        if(x == maze.length-1 && y == maze.length-1 && maze[x][y] == 1 ){
            sol[x][y]=1;
            return true;
        }
        // check if maze[x]][y] is valid
        if(isSafe(maze, x, y) == true){
            if(sol[x][y] == 1){
                return false;
            }
            sol[x][y] = 1;
            if(solveMazeUtil(maze, x+1, y, sol))
                return true;
            if(solveMazeUtil(maze, x, y+1, sol))
                return true;
            sol[x][y]=0;
            return false;
        }
        return false;
    }

    private static boolean solveMaze(int maze[][]){
        int N = maze.length;
        int solMtx[][] = new int[N][N];
        if(solveMazeUtil(maze, 0, 0, solMtx) == false){
            System.out.println(" Solution does not exist");
            return false;
        }
        printSol(solMtx);
        return true;
    }

    public static void main(String arg[]){
        int mazeMtx[][] = {
                        {1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {0, 1, 0, 0},
                        {1, 1, 1, 1}
                          };   // here 0 represent maze's blocked location whlie 1 is open/available path that RAT can take to reach it's destination.
        solveMaze(mazeMtx);
    }
}