public class IndecesArr{ //O(n)

    public static void getIndeces(int arr[],int key,int idx){
        if(idx==arr.length){
            return;
        }
        if(key==arr[idx]){
            System.out.print("["+idx+"] ");
        }
        getIndeces(arr,key,++idx); 
    }

    public static void main(String arg[]){
        int arr[] = {3, 2, 4, 5, 3, 2, 7, 2, 2};
        getIndeces(arr,2,0);
    }
}