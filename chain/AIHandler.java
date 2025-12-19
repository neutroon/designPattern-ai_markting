package chain;

public class AIHandler extends Handler {

    public void handle() {
        System.out.println("AI Analysis");
        if (next != null) {
            next.handle();
        }
    }
}
