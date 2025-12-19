package adapter;

public class FacebookAdapter implements AdsPlatform {

    private FacebookAdsAPI facebook = new FacebookAdsAPI();

    public void publishAd(String content) {
        facebook.postAd(content);
    }
}
