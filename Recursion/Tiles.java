public class Tiles{ // O(2^n)
    
    public static int noOfTilesWays(int n){
    /*    
        ...........n.............   ...1....
        |                       |   |      |
        2        Floor          2   2 Tile |
        |                       |   |      |
        ...........n.............   ........ 
    */

        if(n==0 || n==1){
            return 1; // ways=1
        }
        return noOfTilesWays(n-1)+noOfTilesWays(n-2); 
        /* (n-2) part left when tiles laying horizontal
           (n-1) part left when tiles laying vertical
           1 tile size =  (2X1)
        */
    
    }

    public static void main(String arg[]){
        System.out.println("Ways of no. of tiles laying: "+noOfTilesWays(4));
    }
}