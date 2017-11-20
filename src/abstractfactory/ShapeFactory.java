package abstractfactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String type) {
        Shape shape = null;

        if (type.equals("Circle")) {
            shape = new Circle();
        } else if (type.equals("Rect")) {
            shape = new Rectangle();
        }

        return shape;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
