package chain;

public class ValidationHandler extends Handler {

    public void handle() {
        System.out.println("Validating Data");
        if (next != null) {
            next.handle();
        }
    }
}
