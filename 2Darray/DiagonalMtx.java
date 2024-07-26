public class DiagonalMtx{

    private static void diagonalSum1(int arr[][]){ //O(n^2)
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i==j){ // primary diagonal sum
                    sum += arr[i][j];
                }else if(i+j==arr.length-1){ //secondary diagonal sum
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Diagonal Sum: "+sum);
    }

    private static void diagonalSum2(int arr[][]){ //O(n)
        int sum=0;
        for(int i=0; i<arr.length; i++){
            //primary diagonal sum
            sum +=arr[i][i];
            //secondary diagonal sum
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        System.out.println("Diagonal Sum: "+sum);
    }

    public static void main(String arg[]){
        int mtx[][] = {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                      };
        diagonalSum1(mtx);
        diagonalSum2(mtx);
    }
}