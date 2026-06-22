class Student {
    private String name;

    public String getName() {
        return name ;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class C4hide {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Isaak @codingal");
        System.out.println(s.getName());
    }
}