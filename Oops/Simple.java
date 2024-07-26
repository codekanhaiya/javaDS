class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

public class Simple{
    public static void main(String arg[]){
        Pen obj = new Pen();
        obj.setColor("Blue");
        obj.setTip(5);
        obj.setColor("Green");
        System.out.println(obj.color);
        System.out.println(obj.tip);
    }
}