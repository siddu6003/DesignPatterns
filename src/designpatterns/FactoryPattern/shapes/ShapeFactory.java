package designpatterns.FactoryPattern.shapes;

public class ShapeFactory {

    private Shape shape;
    public Shape getShape(String input) {
        switch (input) {
            case "RECTANGLE" : shape = new Rectangle();
            break;

            case "SQUARE" : shape = new Square();
            break;

            default: shape = null;
            break;
        }

        return shape;
    }
}
