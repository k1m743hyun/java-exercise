package src;

public class CustomResource implements AutoCloseable {

    public CustomResource() {
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
