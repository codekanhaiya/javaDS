abstract class Janvar{ // Ist way of implementation of abstraction using abstract class
    void eat(){
        System.out.println("Animal eats...");
    }
    abstract void walk();
}
class Horse extends Janvar{
    void walk(){
        System.out.println("Horse walks on 4 legs.");
    }
}
class Chicker extends Janvar{
    void walk(){
        System.out.println("Chicker walks on 2 legs.");
    }
}

interface ChessPlayer{ // IInd way of implementation of abstraction using interface or total abstraction 
    abstract void moves();
    void who();
}
class Queen implements ChessPlayer{
    public void who(){
        System.out.print("I am Queen. ");
    }
    public void moves(){
        System.out.println("And my moves are: Up, Down, Left, Right & Diagonal (In all 8 directions).");
    }
}
class Rook implements ChessPlayer{
    public void who(){
        System.out.print("I am Rook. ");
    }
    public void moves(){
        System.out.println("And my moves are: Up, Down, Left, Right (In all 4 directions).");
    }
}
class King implements ChessPlayer{
    public void who(){
        System.out.print("I am King. ");
    }
    public void moves(){
        System.out.println("And my moves are: Up, Down, Left, Right & Diagonal (In all 8 directions).");
    }
}

public class Abstraction{
    public static void main(String arg[]){

    Horse obj1 = new Horse();
    obj1.eat();
    obj1.walk();

    Chicker obj2 = new Chicker();
    obj2.eat();
    obj2.walk();

    
    Queen obj3 = new Queen();
    obj3.who();
    obj3.moves();

    Rook obj4 = new Rook();
    obj4.who();
    obj4.moves();

    King obj5 = new King();
    obj5.who();
    obj5.moves();
    }
}