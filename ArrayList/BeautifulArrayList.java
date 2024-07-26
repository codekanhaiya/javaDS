import java.util.ArrayList;

public class BeautifulArrayList{
    
    public static ArrayList<Integer> beautiArray1(int n){ // Itterative Approach // O(n)
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i=2; i<=n; i++){
            ArrayList<Integer>temp=new ArrayList<>();
            for(Integer e:ans){
                if(2*e<=n)temp.add(e*2);
            }
            for(Integer e:ans){
                if(2*e-1<=n)temp.add(e*2-1);
            }
            ans=temp;
        }
        return ans;
    } 
    

    private static void divideConque(int start, int increment, ArrayList<Integer> res, int n){
        if(start + increment > n){
            res.add(start);
            return;
        }
        divideConque(start, 2*increment, res, n);
        divideConque(start+increment, 2*increment, res, n);
    }
    public static ArrayList<Integer> beautiArray2(int n){ // Divide & Conquer Approach
        ArrayList<Integer> ans = new ArrayList<>();
        divideConque(1, 1, ans, n);
        return ans;
    }
    
    public static void main(String args[]){
        int num1=4;
        int num2=5;
    
        System.out.println("Beautiful Arraylist of number "+num1+" is: "+beautiArray1(num1));
        System.out.println("Beautiful Arraylist of number "+num2+" is: "+beautiArray1(num2));

        System.out.println("Beautiful Arraylist of number "+num1+" is: "+beautiArray2(num1));
        System.out.println("Beautiful Arraylist of number "+num2+" is: "+beautiArray2(num2));
    }
}