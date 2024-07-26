import java.util.*;

public class recursionProblem{
    
    public static int numOfTilesWays(int n){ // let floorSize 2*n
        if(n==0||n==1){
            return 1;
        }
        // int way1 = numOfTilesWays(n-2);    //horizontal case
        // int way2 = numOfTilesWays(n-1);    //vertical case
        // int totalWays=way1+way2;
        // return totalWays;
        return numOfTilesWays(n-2)+numOfTilesWays(n-1);
    }
    
    public static void rmvDuplicate(StringBuilder newStr,String str, int idx, boolean map[]){
        // base case                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        // kaam
        char currentChar=str.charAt(idx);
        if(map[currentChar-'a']==true){
            //duplicate case
            rmvDuplicate(newStr,str,idx+1,map);
        }else{
            //unique case
            map[currentChar-'a']=true;
            newStr=newStr.append(currentChar);
            rmvDuplicate(newStr.append(currentChar),str,idx+1,map);
        }
    }

    public static int friendsPair(int n){ // n = Number Of Friends
        if(n==1||n==2){ // base case
            return n;
        }
        //kaam
        //single hone par
        int fnm1=friendsPair(n-1);
        //pair hone par
        int fnm2=friendsPair(n-2);
        //total ways
        int totalWays=fnm1+(n-1)*fnm2;
        return totalWays;

    }
    
    public static void nDigNotConsecutive1BinStr(int n, int lastPlc, String str){ // n = max number of digit in bianary string 
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        if(lastPlc==0){
            //sit 0 on chair n 
            nDigNotConsecutive1BinStr(n-1,0,str+"0");
            nDigNotConsecutive1BinStr(n-1,1,str+"1");
        }else{
            nDigNotConsecutive1BinStr(n-1,0,str+"0");
        }
    }

    public static void main(String[] args){
        System.out.println("Total ways for fitting tiles on 2*n size floor: "+numOfTilesWays(6));
        System.out.print("String after removing duplicate characters: "); rmvDuplicate(new StringBuilder(""),"apanacollegeisaglobalwebsite",0,new boolean [26]);
        System.out.println("Toatal pairways: "+friendsPair(4));
        System.out.println("Total Formed binary string: "); nDigNotConsecutive1BinStr(5,0,"");
    }
}