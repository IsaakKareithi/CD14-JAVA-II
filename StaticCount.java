public class StaticCount {
    // uncommon the below lines to know the importance of static keywords

    int number = 10;
    // static ibt number = 10

    void increment(){
        number = number +1;
    }

    public static void main(String[] args){
        StaticCount obj1 = new StaticCount();
        StaticCount obj2 = new StaticCount();
        StaticCount obj3 = new StaticCount();

        // Guess the answer
        obj1.increment();
        obj2.increment();
        obj3.increment();

        // to check your answers, uncomment the next lines

        System.out.println(obj1.number);
        System.out.println(obj2.number);
        System.out.println(obj3.number);
    }
}
