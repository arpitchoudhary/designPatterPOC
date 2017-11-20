package factory;

public class ShapeFactory {


    public static Shape getShapeInstance(String shapeType) {

        Shape shape = null;

        if (shapeType.equals("Circle")) {
            shape = new Circle();
        } else if (shapeType.equals("Rect")) {
            shape = new Rectangle();
        }

        return shape;
    }


}
