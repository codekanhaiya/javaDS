public class AddMtx{

    private static void addRow(int arr[][], int r){
        int sum=0;
        for(int j=0; j<arr[0].length; j++){
            sum+=arr[r-1][j];
        }
        System.out.println("Total sum of "+r+" row: "+sum);
    }

    public static void main(String arg[]){
        int[][] mtx = {
                   {1, 4 , 9},
                   {11, 4, 3},
                   {2, 2 , 3}
                  };
        int row=3;
        addRow(mtx, row);
    }
}