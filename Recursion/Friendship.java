public class Friendship{ // O(2^n)
    
    public static int totalWaysPair(int n){
        if(n==1 || n == 2){
            return n;
        }
        return totalWaysPair(n-1)+(n-1)*(n-2); 
    }

    public static void main(String arg[]){
       int  noOfStudents=4;
        System.out.println("Total ways pairing: "+totalWaysPair(noOfStudents));
    }
}