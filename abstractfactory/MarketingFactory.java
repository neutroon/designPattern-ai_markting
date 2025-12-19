package abstractfactory;

public interface MarketingFactory {

    AdGenerator createAd();

    ContentGenerator createContent();
}
