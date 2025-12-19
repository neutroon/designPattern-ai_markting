package adapter;

public class GoogleAdapter implements AdsPlatform {

    private GoogleAdsAPI google = new GoogleAdsAPI();

    public void publishAd(String content) {
        google.publish(content);
    }
}
