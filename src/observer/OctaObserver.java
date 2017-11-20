package observer;

public class OctaObserver extends Observer {

    public OctaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Octal for the state is " + Integer.toOctalString(subject.getState()));
    }
}
