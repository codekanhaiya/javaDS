class Vehicle{
    int engineCapacity;
    int runningCapacity;
}
class Bicycle extends Vehicle{
    void func(){
        System.out.println("A Bicycle have no engine but it have "+runningCapacity+" Km/H running capacity.");
    }
}
class Bike extends Vehicle{
    void func(){
        System.out.println("A Bike have "+engineCapacity+"CC engine capacity and it have "+runningCapacity+" Km/H running capacity.");
    }
}
class Car extends Vehicle{
    void func(){
        System.out.println("A Car have "+engineCapacity+"CC engine and it have "+runningCapacity+" Km/H running capacity.");
    }
}

public class HierarchicalInheritance{
    public static void main(String arg[]){

        Bicycle obj1 = new Bicycle();
        obj1.engineCapacity=0;
        obj1.runningCapacity=50;
        obj1.func();

        Bike obj2 = new Bike();
        obj2.engineCapacity=50;
        obj2.runningCapacity=200;
        obj2.func();

        Car obj3 = new Car();
        obj3.engineCapacity=200;
        obj3.runningCapacity=500;
        obj3.func();

    }
}