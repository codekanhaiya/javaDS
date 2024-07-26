class Animal{
    String color;
}
class Mammels extends Animal{
    int leg;
}
class Dog extends Mammels{
    String tail;
}

public class MultilevelInheritance{
    public static void main(String args[]){
        
        Dog obj1 = new Dog();
        obj1.color="Light Brown";
        obj1.leg=4;
        obj1.tail="1 Tail";
        System.out.println("A Dog with "+obj1.leg+" Leg and "+obj1.tail+" that is "+obj1.color+" in color.");

        Dog obj2 = new Dog();
        obj1.color="Dark Black";
        obj1.leg=4;
        obj1.tail="1 Tail";
        System.out.println("A Dog with "+obj1.leg+" Leg and "+obj1.tail+" that is "+obj1.color+" in color.");
    }
}