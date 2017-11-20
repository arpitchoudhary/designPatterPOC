package abstractfactory;


public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String type) {
        return null;
    }

    @Override
    Color getColor(String colorType) {
        Color color = null;

        if (colorType.equals("green")) {
            color = new Green();
        } else if (colorType.equals("blue")) {
            color = new Blue();
        }

        return color;
    }
}
