package main;

import singleton.AIEngine;
import abstractfactory.*;
import factory.*;
import builder.*;
import adapter.*;
import bridge.*;
import composite.*;
import chain.*;
import command.*;

public class MainApp {

    public static void main(String[] args) {

        /* ==============================
           1️⃣ Singleton Pattern
        ============================== */
        System.out.println("=== Singleton Pattern ===");
        AIEngine aiEngine = AIEngine.getInstance();
        aiEngine.analyzeCustomer();


        /* ==============================
           2️⃣ Abstract Factory Pattern
        ============================== */
        System.out.println("\n=== Abstract Factory Pattern ===");

        MarketingFactory localFactory = new LocalMarketingFactory();
        localFactory.createAd().generateAd();
        localFactory.createContent().generateContent();

        MarketingFactory internationalFactory = new InternationalMarketingFactory();
        internationalFactory.createAd().generateAd();
        internationalFactory.createContent().generateContent();


        /* ==============================
           3️⃣ Factory Pattern
        ============================== */
        System.out.println("\n=== Factory Pattern ===");

        Campaign emailCampaign = CampaignFactory.createCampaign("email");
        emailCampaign.launch();

        Campaign smsCampaign = CampaignFactory.createCampaign("sms");
        smsCampaign.launch();


        /* ==============================
           4️⃣ Builder Pattern
        ============================== */
        System.out.println("\n=== Builder Pattern ===");

        MarketingCampaign campaign
                = new MarketingCampaign.CampaignBuilder()
                        .setAudience("Young Adults")
                        .setChannel("Social Media")
                        .setBudget(5000)
                        .build();

        System.out.println("Campaign Created:");
        System.out.println("Audience: " + campaign.audience);
        System.out.println("Channel: " + campaign.channel);
        System.out.println("Budget: " + campaign.budget);


        /* ==============================
           5️⃣ Adapter Pattern
        ============================== */
        System.out.println("\n=== Adapter Pattern ===");

        AdsPlatform facebookAds = new FacebookAdapter();
        facebookAds.publishAd("Big Sale 50% Off!");

        AdsPlatform googleAds = new GoogleAdapter();
        googleAds.publishAd("New Product Launch");


        /* ==============================
           6️⃣ Bridge Pattern
        ============================== */
        System.out.println("\n=== Bridge Pattern ===");

        Advertisement emailAd = new ProductAd(new EmailChannel());
        emailAd.show();

        Advertisement smsAd = new ProductAd(new SmsChannel());
        smsAd.show();


        /* ==============================
           7️⃣ Composite Pattern
        ============================== */
        System.out.println("\n=== Composite Pattern ===");

        CampaignComponent single1 = new SingleCampaign();
        CampaignComponent single2 = new SingleCampaign();

        CampaignGroup campaignGroup = new CampaignGroup();
        campaignGroup.add(single1);
        campaignGroup.add(single2);

        campaignGroup.execute();


        /* ==============================
           8️⃣ Chain of Responsibility
        ============================== */
        System.out.println("\n=== Chain of Responsibility ===");

        Handler validationHandler = new ValidationHandler();
        Handler aiHandler = new AIHandler();

        validationHandler.setNext(aiHandler);
        validationHandler.handle();


        /* ==============================
           9️⃣ Command Pattern
        ============================== */
        System.out.println("\n=== Command Pattern ===");

        CampaignInvoker invoker = new CampaignInvoker();

        invoker.setCommand(new LaunchCampaignCommand());
        invoker.run();

        invoker.setCommand(new StopCampaignCommand());
        invoker.run();
    }
}
