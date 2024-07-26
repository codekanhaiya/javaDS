class Person{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class Encapsulation{
    public static void main(String arg[]){
        Person obj = new Person();
        obj.setName("Kanhaiya Gupta");
        obj.setAge(15);
        System.out.println("Name: "+obj.getName());
        System.out.println("Age: "+obj.getAge());
    }
}