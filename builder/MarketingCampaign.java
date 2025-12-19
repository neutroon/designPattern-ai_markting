package builder;

public class MarketingCampaign {

    public String audience;
    public String channel;
    public double budget;

    private MarketingCampaign(CampaignBuilder builder) {
        this.audience = builder.audience;
        this.channel = builder.channel;
        this.budget = builder.budget;
    }

    public static class CampaignBuilder {

        private String audience;
        private String channel;
        private double budget;

        public CampaignBuilder setAudience(String audience) {
            this.audience = audience;
            return this;
        }

        public CampaignBuilder setChannel(String channel) {
            this.channel = channel;
            return this;
        }

        public CampaignBuilder setBudget(double budget) {
            this.budget = budget;
            return this;
        }

        public MarketingCampaign build() {
            return new MarketingCampaign(this);
        }
    }
}
