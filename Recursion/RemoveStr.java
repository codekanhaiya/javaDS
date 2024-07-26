public class RemoveStr{ // O(n)
    
    public static String rmvDuplicate(String myStr, StringBuilder newStr, int idx, boolean AlphTbl[]){
        if(idx==myStr.length()){
            return "";
        }

        char currChar = myStr.charAt(idx);
        if(AlphTbl[currChar-'a']==true){ // char already present in string
            rmvDuplicate(myStr,newStr,idx+1,AlphTbl);
        }else{ // unique char
            AlphTbl[currChar-'a']=true;
            newStr=newStr.append(currChar);
            rmvDuplicate(myStr,newStr,idx+1,AlphTbl);
        } 
        return newStr.toString();
    }

    public static void main(String arg[]){
        String myStr = "apnacollege"; 
        System.out.println("Unique char string: "+rmvDuplicate(myStr,new StringBuilder(""),0,new boolean [26]));
    }
}