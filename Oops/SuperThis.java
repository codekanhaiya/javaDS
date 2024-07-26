class Grand{
    int property=55;
}
class Father extends Grand{
    String name;
    int property;
    public void getTotalProperty(String name,int property){
        System.out.println(name+" have total "+(this.property=property+super.property)+"L Rs. property.");
    }
}

public class SuperThis{
    public static void main(String ar[]){
        Father obj = new Father();
        obj.getTotalProperty("Raj Kumar Rao",25);
    }
}