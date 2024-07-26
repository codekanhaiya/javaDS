public class FindMajorityArr{

    public static int getMajorityElement1(int arr[]){  // O(n^2)
        int majorityCount = arr.length/2; // it is condition in given problem
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    count+=1;
                }
            }
            if(count > majorityCount){
                return arr[i];
            }
        }
        return -1;
    }


    public static int getMajorityElement2(int arr[]){  // O(nlog(n))
        return majorityElementRec(arr, 0, arr.length-1);
    }
    private static int majorityElementRec(int num[], int lIdx, int hIdx){
        if(lIdx == hIdx){ // base case: the only element in an array of size 1 is the majority element.
            return num[lIdx];
        }

        // recuse on left and right halves of this slice.
        int mid = (hIdx-lIdx)/2+lIdx;
        int left = majorityElementRec(num, lIdx, mid);
        int right = majorityElementRec(num, mid+1, hIdx);

        if(left == right){ // if the two halves agree on the majority element, return it.
            return left;
        }

        // otherwise count each element and return the "winner".
        int leftCount = countInRange(num, left, lIdx, hIdx);
        int rightCount = countInRange(num, right, lIdx, hIdx);

        return leftCount > rightCount ? left : right;
    }
    private static int countInRange(int nums[], int num, int lIdx, int hIdx){
        int count = 0;
        for(int i=lIdx; i<=hIdx; i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        int array[] = {2, 2, 1, 1, 1, 1, 2, 2, 2};
        System.out.println(getMajorityElement1(array));
        System.out.println(getMajorityElement2(array));
    }
}