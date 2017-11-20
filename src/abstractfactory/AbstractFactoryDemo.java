package abstractfactory;

public class AbstractFactoryDemo {


    public static void main(String... args){

        AbstractFactory factory = FactoryProducer.getFactory("shape");

        Shape circle = factory.getShape("Circle");
        circle.draw();

        Color green = FactoryProducer.getFactory("color").getColor("green");
        green.fill();

    }
}
