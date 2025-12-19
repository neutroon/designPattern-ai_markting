package command;

public class CampaignInvoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }
}
