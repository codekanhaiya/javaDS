class Features{
    String bodyColor;
    public void run(String name){
        System.out.println(name+" runs fast who have "+bodyColor+" body color.");
    }
}

class Teen extends Features{
    Teen(String name, String bdCol){
        bodyColor=bdCol;
        run(name);
    }
}

public class SingleInheritance{
    public static void main(String args[]){
        Teen obj1 = new Teen("Raj","Brown");
        Teen obj2 = new Teen("Ranjeet","Dark");
    }
}