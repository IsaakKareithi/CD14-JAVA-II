// this program is used to teach on abstraction
public class C5Abstraction {
    public static void Main(String args){

        Objects obj = new Sphere(); //object of sphere
        obj.shape();
        obj.showshape();

        obj = new Cuboid();
        obj.shape();
        obj.showshape();

        obj = new Prism();
        obj.shape();
        obj.showshape();

    }
}

abstract class Objects{
    // abstract method declaration
    abstract void showshape();

    public void shape() {
        System.out.println("I'm from abstract class");
    }
}

class Sphere extends Objects{
    void showshape(){
        System.out.println("The shape is a sphere");
    }
}

class Cuboid extends Objects{
    void showshape(){
        System.out.println("The shape is a cuboid");
    }
}

class Prism extends Objects{
    void showshape(){
        System.out.println("The shape is a prism");
    }
}