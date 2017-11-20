package decorator;

public class RedDecorator extends ShapeDecorator {

    public RedDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border Color: Red");
    }
}
