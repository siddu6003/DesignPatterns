package designpatterns.FactoryPattern.shapes;

public class Rectangle implements Shape {
    @Override
    public int getArea(int side) {
        return 2 * side;
    }
}
