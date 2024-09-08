package designpatterns.FactoryPattern.shapes;

public class Square implements Shape {
    @Override
    public int getArea(int side) {
        return side * side;
    }
}
