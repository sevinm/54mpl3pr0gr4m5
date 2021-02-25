abstract class shape{
    abstract void noofsides();
}
class rectangle extends shape{
    
    void noofsides(){
        System.out.println("Sides 4");
    }
}
class triangle extends shape{
    
    void noofsides(){
        System.out.println("Sides 3");
    }
}
class hexagon extends shape{
    
    void noofsides(){
        System.out.println("Sides 6");
    }
}
public class sides{
    public static void main (String[] args) {
        shape s;
        s= new rectangle();
        s.noofsides();
                s= new triangle();
        s.noofsides();
                s= new hexagon();
        s.noofsides();
    }
}
