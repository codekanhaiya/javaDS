public class GridWays{

    private static int gridWay1(int i, int j, int n, int m){ // O(2^(n+m))
        if(i==n-1 && j==m-1){ // base case
            return 1;
        }else if(i==n ||j==m){ //boundry cross condition
            return 0;
        }
        int w1 = gridWay1(i+1, j, n, m); // moving allow only down
        int w2 = gridWay1(i, j+1, n, m); // moving allow only right
        return w1+w2;
    }

    public static void main(String arg[]){ 
        int mtx[][] = new int[3][3];
        System.out.println("Toatal Grid Ways: "+gridWay1(0,0,mtx.length, mtx[0].length));
    }
}