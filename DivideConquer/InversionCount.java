public class InversionCount{

    public static int getinvCount1(int arr[]){ // O(n^2)
        int n = arr.length;
        int invCount = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    invCount+=1;
                }
            }
        }
        return invCount;
    }


    public static int getinvCount2(int arr[]){ // O(nlog(n))
        int n = arr.length;
        return mrgSort(arr, 0, n-1);
    }
    private static int mrgSort(int arr[], int left, int right){
        int invCount = 0;

        if(right > left){
            int mid = (right+left)/2;
            invCount = mrgSort(arr, left, mid);
            invCount += mrgSort(arr, mid+1, right);
            invCount += merge(arr, left, mid+1, right);
        }
        return invCount;
    }
    private static int merge(int arr[], int left, int mid, int right){
        int i=left, j=mid, k=0;
        int invCount = 0;
        int temp[] = new int[(right - left + 1)];
        while((i<mid) && (j<=right)){
            if(arr[i] <= arr[j]){
                temp[k]=arr[i];
                k++; i++;
            }else{
                temp[k] = arr[j];
                invCount += (mid-i);
                k++; j++;
            }
        }
        while(i<mid){
            temp[k++]=arr[i++];
        }
        while(j<=right){
            temp[k++]=arr[j++];
        }
        for(i=left, k=0; i<=right; i++,k++){
            arr[i]=temp[k];
        }
        return invCount;
    }

    public static void main(String arg[]){
        int array[] = {1, 20, 6, 4, 5};
        System.out.println("Inversion count: "+getinvCount1(array)); 
        System.out.println("Inversion count: "+getinvCount2(array)); 
    }
}