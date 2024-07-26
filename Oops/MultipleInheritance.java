interface Harbivore{
    abstract void eat1();
}
interface Carnivore{
    void eat2();
}
class Bear implements Harbivore, Carnivore{
    Bear(){
        System.out.println("I am a Bear.");
    }
    public void eat1(){
        System.out.println("Harbivores eats plant materials.");
    }
    public void eat2(){
        System.out.println("Carnivore eats meat, or sometimes the flesh of animals.");
    }
}

public class MultipleInheritance{
    public static void main(String arg[]){
        Bear obj = new Bear();
        obj.eat1();
        obj.eat2();
    }
}