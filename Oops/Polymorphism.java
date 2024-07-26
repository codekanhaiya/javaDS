class Calculator{  // Method-Overloading OR Static-Polymorphism
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
}

class Human{  // Method-Overriding OR Dynamic-Polymorphism
    void eat(){
        System.out.println("Eating anything...");
    }
}
class Man extends Human{
    void eat(){
        System.out.println("Eating Food...");
    }
}

public class Polymorphism{
    public static void main(String arg[]){

        Calculator obj1 = new Calculator();
        System.out.println("Sum: "+obj1.sum(10,78));
        System.out.println("Sum: "+obj1.sum(10.2f,78.1f));

        Human obj2 = new Human();
        obj2.eat();
        Man obj3 = new Man();
        obj3.eat();
    }
}