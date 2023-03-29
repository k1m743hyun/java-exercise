package src;

public class NewCustomResource implements AutoCloseable {

    public NewCustomResource() {
        System.out.println(getClass().getName() + " Constructor");
    }

    public void printMessage() {
        System.out.println(getClass().getName() + " Print Message");
    }

    @Override
    public void close() throws Exception {
        System.out.println(getClass().getName() + " close");
    }
}
