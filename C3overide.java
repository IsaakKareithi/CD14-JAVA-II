class Parent{
    public void sayyHello(){
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent{
    @Override
    public void sayHello(){
        System.out.println("Hello from Child");
    }
}

public class C3overide {
    public static void main(String[] args){
        Parent p = new Child(); // for calling hello from child 
        // parent = new Parent

        p.sayHello();
    }
}
