// find the area of the square

import java.util.*;

public class variables2{
    public static void main(String args[]){
        System.out.println("Input the side of square: ");
        Scanner sc  = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area: "+area);
    }
}