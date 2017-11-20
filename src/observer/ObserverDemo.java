package observer;

public class ObserverDemo {

    public static void main(String... args){
        Subject subject = new Subject();

        new OctaObserver(subject);
        new BinaryObserver(subject);

        System.out.println("\nFirst state change: 15");
        subject.setState(15);
        System.out.println("\nSecond state change: 10");
        subject.setState(10);
    }
}
