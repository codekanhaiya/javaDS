class Student{
    String name;
    int roll;
    Student(String name, int roll){ // (1)parameterized constructor
        this.name=name;
        this.roll=roll;
    }
    Student(){ // (2)Not-parameterized constructor
        System.out.println(name);
        System.out.println(roll);
    }

    Student(Student s1){ // (3)Copy Constructor
        this.name=s1.name;
        this.roll=s1.roll;
    }
    public void show(){
        System.out.println(this.name);
        System.out.println(this.roll);
    }
}

public class Constructor{
    public static void main(String args[]){
        Student obj1 = new Student("Kanha",25);
        obj1.show();
        // obj.Student("Radha",50); //second calling is not possible
        Student obj2 = new Student();
        obj2.show();
        Student s1 = new Student();
        s1.name="Radha"; s1.roll=1;
        s1.show();
        Student obj3 = new Student(s1);
        obj3.show();
        
    }
}