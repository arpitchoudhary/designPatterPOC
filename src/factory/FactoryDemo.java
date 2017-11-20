package factory;

public class FactoryDemo {


    public static void main(String... args){

        Shape circle = ShapeFactory.getShapeInstance("Circle");
        circle.draw();

        Shape rect = ShapeFactory.getShapeInstance("Rect");
        rect.draw();

    }

}
