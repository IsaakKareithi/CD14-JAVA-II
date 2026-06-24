public class C5Polymorphism {
    public static void main(String args[]){

        Hillstations A = new Hillstations();
        Hillstations M = new Manali();
        Hillstations Mu = new Mussorie();
        Hillstations G = new Gulmarg();

        A.location();
        A.famousfor();

        M.location();
        M.famousfor();

        Mu.location();
        Mu.famousfor();

        G.location();
        G.famousfor();

    }
}

class Hillstations{
    void location(){
        System.out.println("Location is: ");
    }   
    void famousfor(){
        System.out.println("Famous for: ");
    }
}

class Manali extends Hillstations{
    void location(){
        System.out.println("Manali is in Himpach Pradesh");
    }
    void famousfor(){
        System.out.println("It is famous for Hadimba Temple and adventure sports");
    }
}

class Mussorie extends Hillstations{
    void location(){
        System.out.println("Mussorie is in Utterkhand");
    }
    void famousfor(){
        System.out.println("It is famous for its education institutions");
    }
}

class Gulmarg extends Hillstations{
    void location(){
        System.out.println("Gulmarg is in J&K");
    }
    void famousfor(){
        System.out.println("It is famous for skiing");
    }
}