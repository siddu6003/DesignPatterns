package designpatterns.FactoryPattern.shapes;

public class FactoryMain {
    public static void main(String args[]) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        System.out.println(shape1.getArea(2));

        Shape shape2 = shapeFactory.getShape("SQUARE");
        System.out.println(shape2.getArea(4));
    }
}
