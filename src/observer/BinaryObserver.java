package observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Binary for the state is " + Integer.toBinaryString(subject.getState()));
    }
}
