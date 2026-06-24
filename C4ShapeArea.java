class C4ShapeArea {
    public double getArea(){
        return 0;
    }
}

// a triangle with base and height
class Triangle extends C4ShapeArea{
    private double base;
    private double height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

// a square is a shape with a specific side
class Square extends C4ShapeArea{
    private double side;
    public Square(double side) {
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }
}

class Main{
    public static void main(String args[]){
        C4ShapeArea[] shape = new C4ShapeArea[2];

        shape[0] = new Square(5);
        shape[1] = new Triangle(2, 5);

        System.out.println("Area of the square is: " + shape[0].getArea());
        System.out.println("Area of the triangle is: " + shape[1].getArea());
    }
}
