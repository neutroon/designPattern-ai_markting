package bridge;

public abstract class Advertisement {

    protected Channel channel;

    protected Advertisement(Channel channel) {
        this.channel = channel;
    }

    public abstract void show();
}
