public class TowerOfHanoi{  // O(2^n)

    public static void hannoi(int n, String src, String dest, String help){
        if(n==0){
            return;
        }

        hannoi(n-1,src,help,dest);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        hannoi(n-1,help,dest,src);
    }

    public static void main(String ar[]){
        int n=3;
        hannoi(n,"A","B","C"); // A:source, B:destination, C:help
    }
}