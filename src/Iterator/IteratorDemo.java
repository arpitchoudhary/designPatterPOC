package Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        NameContainer namesRepository = new NameContainer();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

}
