public class overiding {
    int id ;
    String name;
    float stipend;

    overiding(){}

    overiding(int id, String name){
        this.id = id;
        this.name = name;
    }
    overiding(int id, String name, float stipend){
        this.id = id;
        this.name = name;
        this.stipend = stipend;

    }

    void displayDetails(){
        System.out.println(this.id + " | " + this.name + " | " + this.stipend);


    }
}

// student
class Main1{
    public static void main(String[] args){
        overiding st1 = new overiding(); // default constructor
        overiding st2 = new overiding(45, "Isaak");
        overiding st3 = new overiding(234, "Cody", 10000);

        st1.displayDetails();
        st2.displayDetails();
        st3.displayDetails();
    }
}
