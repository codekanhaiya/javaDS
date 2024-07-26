public class MyString{
    public static void main(String arg[]){
         char[] name1 = {'K','a','n','h','a','i','y','a'};
         String name2 = "Kanhaiya";
         String name3 = new String("Kanhaiya");
         String name4 = "Kanhaiya";
         String name5 = new String("Kanhaiya");

        //Printing
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        //Comparison
        System.out.println(name2==name3);
        System.out.println(name2.equals(name3));
        System.out.println(name2==name4);
        System.out.println(name3.equals(name5));
        System.out.println(name3==name5);

        //Length
        System.out.println(name1.length);
        System.out.println(name2.length());
        System.out.println(name3.length());

        //Concatenation
        String lname = "Gupta";
        System.out.println(name1+" "+lname);
        System.out.println(name2+" "+lname);
        System.out.println(name3+" "+lname);
        
        System.out.println(name2.concat(lname));
        System.out.println(name3.concat(lname));

        //Substring
        System.out.println(name1[0]);
        System.out.println(name2.charAt(5));
        System.out.println(name3.charAt(5));
        System.out.println(name2.substring(2,6));
        System.out.println(name3.substring(2,6));

    }
}