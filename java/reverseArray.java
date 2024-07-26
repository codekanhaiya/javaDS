public class reverseArray{

    public static void print(int newArray[]){
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i]+" ");
        }
    }

    public static void main(String[] args){
        int array[]={2,4,6,10,12,58};
        int left=0, right=(array.length)-1;
        print(array);
        while(left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        System.out.println();
        print(array);
    }
}