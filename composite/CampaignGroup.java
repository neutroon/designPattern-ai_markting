package composite;

import java.util.*;

public class CampaignGroup implements CampaignComponent {

    private List<CampaignComponent> campaigns = new ArrayList<>();

    public void add(CampaignComponent c) {
        campaigns.add(c);
    }

    public void execute() {
        for (CampaignComponent c : campaigns) {
            c.execute();
        }
    }
}
