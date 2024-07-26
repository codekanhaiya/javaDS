class Scholar{
    String name;
    static String schoolName;
    static float avgMarks(int phy, int ch, int mt){
        return (phy+ch+mt)/3f;
    }
    final int clgCode=2230;
}

public class StaticFinal{
    public static void main(String arg[]){
        Scholar obj1 = new Scholar();
        obj1.name="Raj Singh";
        obj1.schoolName="BBSCET";
        System.out.println(obj1.name+" get "+obj1.avgMarks(30,50,45)+"% in the class in "+Scholar.schoolName+" : College Code-> "+obj1.clgCode);

         Scholar obj2 = new Scholar();
        obj2.name="Rajesh";
        obj2.schoolName="SPIC";
        System.out.println(obj2.name+" get "+Scholar.avgMarks(30,82,45)+"% in the class in "+Scholar.schoolName+" : College Code-> "+obj2.clgCode);
    }
}