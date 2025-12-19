package bridge;

public class ProductAd extends Advertisement {

    public ProductAd(Channel channel) {
        super(channel);
    }

    public void show() {
        channel.run();
    }
}
