/**
 * basic_inheritance
 */
class Rectangle {
    public int len;
    public int wid;

    public int area() {
         return (len * wid);
    }

    public int circumF() {
       return (2 * len + 2 * wid);
    }
}

class Cuboid extends Rectangle {
    public int ht;

    public int volume() {
        return (area() * ht);
    }
}

//cuboid class is inherited from Rectangle
//all the constructors, methods and variables of parent class will be available in child class

public class basic_inheritance {
     
     public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.len=2;
        r1.wid=3;
        System.out.println(r1.area());
        System.out.println(r1.circumF());


        Cuboid c1 = new Cuboid();
        c1.ht=2;
        c1.len=3;
        c1.wid=4;
        System.out.println(c1.volume());
        System.out.println(c1.area());//area of Rectangle will be displayed

    }
}