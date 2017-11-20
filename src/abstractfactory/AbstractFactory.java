package abstractfactory;

public abstract class AbstractFactory {

    abstract Shape getShape(String type);
    abstract Color getColor(String color);

}
