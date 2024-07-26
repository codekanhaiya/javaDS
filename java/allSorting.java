import java.util.*;
public class allSorting{


    public static void showArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    /********************************************************************************************************************/
    public static void bubbleSort(int arr[]){           // O(n^2);
        for(int turn=0; turn<arr.length-1; turn++){     // because last element is already sorted so we use (arr.length-1)
                                                        // System.out.println("After "+(turn+1)+" Pass: ");
            for(int j=0; j<(arr.length-1)-turn; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                                                        // showArray(arr);
            } 
        }
        System.out.print("Sorted Array using BUBBLE SORT: ");
        showArray(arr);
    }
    /********************************************************************************************************************/

    public static void selectionSort(int arr[]){    // O(n^2)
        for(int i=0; i<arr.length-1; i++){
            int minPos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
            // System.out.println("After "+(i+1)+" Pass: ");
            // showArray(arr);
        }
        System.out.print("Sorted Array using SELECTION SORT: ");
        showArray(arr);
    }
    /********************************************************************************************************************/

    public static void insertionSort(int arr[]){   // O(n^2)
        for(int i=0; i<arr.length; i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                //shiffting
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
            // System.out.println("After "+(i+1)+" Pass: ");
            // showArray(arr);
        }
        System.out.print("Sorted Array using INSERTION SORT: ");
        showArray(arr);
    }
    /********************************************************************************************************************/

    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1]; // because we use intigrate 0
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
            for(int i=0;i<count.length;i++){
                while(count[i]>0){
                    arr[j]=i;
                    j++;
                    count[i]--;
                }
            }
        System.out.print("Sorted Array using COUNTING SORT: ");
        showArray(arr);
    }
    /********************************************************************************************************************/

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;     // index for 1st sorted part
        int j = mid+1;  // index for 2nd sorted part
        int k = 0;      // index for Temp Array
        
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){ // for leftover element of 1st sorted part
            temp[k++]=arr[i++];
        }
        while(j<=ei){  // for leftover element of 2nd sorted part
            temp[k++]=arr[j++];
        }
        //copy Temp Array to Original Array
        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){  // base case
            return;
        }
        // work
        int mid=(ei+si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);

    }
    /********************************************************************************************************************/

    public static void main(String[] args){
        int array[]={40,4,-2,5,10,100,120,111,10,30,40};
        int newArray[]={1,4,1,3,2,6,3,7};  // special array for counting sort
        // showArray(array);
        // bubbleSort(array);
        // selectionSort(array);
        // insertionSort(array);
        // countingSort(newArray);
        /* Following all sorting techniques are uses recursion.  */
        showArray(array);
        mergeSort(array,0,array.length-1);
        showArray(array);
    }
}