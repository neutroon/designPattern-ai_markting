package factory;

public class CampaignFactory {

    public static Campaign createCampaign(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailCampaign(); 
        }else if (type.equalsIgnoreCase("sms")) {
            return new SmsCampaign(); 
        }else {
            throw new IllegalArgumentException("Unknown Campaign Type");
        }
    }
}
