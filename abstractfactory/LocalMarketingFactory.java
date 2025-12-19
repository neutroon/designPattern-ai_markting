package abstractfactory;

public class LocalMarketingFactory implements MarketingFactory {

    public AdGenerator createAd() {
        return new LocalAd();
    }

    public ContentGenerator createContent() {
        return new LocalContent();
    }
}
