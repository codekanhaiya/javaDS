// for showing bill
import java.util.*;
public class variables3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the cost of a pencil: ");
        float pencil = scan.nextFloat();
        System.out.println("Enter the cost of a pen: ");
        float pen = scan.nextFloat();
        System.out.println("Enter the cost of an eraser: ");
        float eraser = scan.nextFloat();

        float total = pen+pencil+eraser;
        float tax = (total*18)/100;  // here 18% GST
        total=total+tax;

        System.out.println("Total cost "+total+" Rs. 18% GST included.");
    }
}