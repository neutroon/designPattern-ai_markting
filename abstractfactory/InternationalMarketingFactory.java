package abstractfactory;

public class InternationalMarketingFactory implements MarketingFactory {

    public AdGenerator createAd() {
        return new InternationalAd();
    }

    public ContentGenerator createContent() {
        return new InternationalContent();
    }
}
