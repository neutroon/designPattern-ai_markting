# AI E-Marketing System

A comprehensive Java-based marketing system that demonstrates various design patterns to implement an intelligent, scalable, and maintainable e-marketing platform. This project showcases 9 different design patterns working together to create a flexible marketing automation system.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Design Patterns](#design-patterns)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Usage Examples](#usage-examples)
- [Pattern Descriptions](#pattern-descriptions)

## 🎯 Overview

The AI E-Marketing System is an educational project that demonstrates how multiple design patterns can be combined to build a robust marketing automation platform. The system includes AI-powered customer analysis, multi-channel campaign management, and integration with various advertising platforms.

## ✨ Features

- **AI-Powered Customer Analysis** - Analyze customer behavior using a singleton AI engine
- **Multi-Channel Campaign Support** - Create and manage campaigns across Email and SMS channels
- **Platform Integration** - Integrate with Facebook and Google Ads platforms
- **Flexible Campaign Building** - Build complex marketing campaigns with customizable parameters
- **Campaign Management** - Launch, stop, and group campaigns efficiently
- **Local & International Marketing** - Support for different marketing strategies based on region

## 🏗️ Design Patterns

This project implements **9 design patterns**:

1. **Singleton Pattern** - AI Engine instance management
2. **Abstract Factory Pattern** - Marketing factory for Local/International content
3. **Factory Pattern** - Campaign creation (Email/SMS)
4. **Builder Pattern** - Flexible campaign building
5. **Adapter Pattern** - Ads platform integration (Facebook/Google)
6. **Bridge Pattern** - Advertisement abstraction with multiple channels
7. **Composite Pattern** - Hierarchical campaign organization
8. **Chain of Responsibility** - Request processing pipeline
9. **Command Pattern** - Campaign operation encapsulation

## 📁 Project Structure

```
AI_E_Marketing_System/
│
├── main/
│   └── MainApp.java              # Main application entry point
│
├── singleton/
│   └── AIEngine.java             # Singleton AI engine for customer analysis
│
├── abstractfactory/
│   ├── MarketingFactory.java     # Abstract factory interface
│   ├── LocalMarketingFactory.java
│   ├── InternationalMarketingFactory.java
│   ├── AdGenerator.java
│   ├── ContentGenerator.java
│   ├── LocalAd.java / InternationalAd.java
│   └── LocalContent.java / InternationalContent.java
│
├── factory/
│   ├── CampaignFactory.java      # Factory for creating campaigns
│   ├── Campaign.java             # Campaign interface
│   ├── EmailCampaign.java
│   └── SmsCampaign.java
│
├── builder/
│   └── MarketingCampaign.java    # Builder pattern for campaign creation
│
├── adapter/
│   ├── AdsPlatform.java          # Target interface
│   ├── FacebookAdapter.java      # Adapter for Facebook Ads
│   ├── GoogleAdapter.java        # Adapter for Google Ads
│   ├── FacebookAdsAPI.java       # Adaptee
│   └── GoogleAdsAPI.java         # Adaptee
│
├── bridge/
│   ├── Advertisement.java        # Abstraction
│   ├── ProductAd.java            # Refined abstraction
│   ├── Channel.java              # Implementation interface
│   ├── EmailChannel.java
│   └── SmsChannel.java
│
├── composite/
│   ├── CampaignComponent.java    # Component interface
│   ├── SingleCampaign.java       # Leaf
│   └── CampaignGroup.java        # Composite
│
├── chain/
│   ├── Handler.java              # Handler interface
│   ├── ValidationHandler.java    # Concrete handler
│   └── AIHandler.java            # Concrete handler
│
└── command/
    ├── Command.java              # Command interface
    ├── LaunchCampaignCommand.java
    ├── StopCampaignCommand.java
    └── CampaignInvoker.java      # Invoker
```

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java compiler (javac)
- Command line terminal

### Compilation

1. Navigate to the project root directory:
```bash
cd AI_E_Marketing_System
```

2. Compile all Java files:
```bash
javac -d . **/*.java
```

Or compile from the root directory:
```bash
javac main/MainApp.java
```

### Running the Application

Run the main application:
```bash
java main.MainApp
```

## 💻 Usage Examples

### Singleton Pattern
```java
AIEngine aiEngine = AIEngine.getInstance();
aiEngine.analyzeCustomer();
```

### Abstract Factory Pattern
```java
MarketingFactory localFactory = new LocalMarketingFactory();
localFactory.createAd().generateAd();
localFactory.createContent().generateContent();
```

### Factory Pattern
```java
Campaign emailCampaign = CampaignFactory.createCampaign("email");
emailCampaign.launch();
```

### Builder Pattern
```java
MarketingCampaign campaign = new MarketingCampaign.CampaignBuilder()
    .setAudience("Young Adults")
    .setChannel("Social Media")
    .setBudget(5000)
    .build();
```

### Adapter Pattern
```java
AdsPlatform facebookAds = new FacebookAdapter();
facebookAds.publishAd("Big Sale 50% Off!");
```

### Bridge Pattern
```java
Advertisement emailAd = new ProductAd(new EmailChannel());
emailAd.show();
```

### Composite Pattern
```java
CampaignGroup campaignGroup = new CampaignGroup();
campaignGroup.add(new SingleCampaign());
campaignGroup.execute();
```

### Chain of Responsibility
```java
Handler validationHandler = new ValidationHandler();
Handler aiHandler = new AIHandler();
validationHandler.setNext(aiHandler);
validationHandler.handle();
```

### Command Pattern
```java
CampaignInvoker invoker = new CampaignInvoker();
invoker.setCommand(new LaunchCampaignCommand());
invoker.run();
```

## 📚 Pattern Descriptions

### 1. Singleton Pattern
Ensures that only one instance of the AI engine exists throughout the application lifecycle, providing centralized AI processing capabilities.

### 2. Abstract Factory Pattern
Creates families of related objects (ads and content) for different marketing contexts (Local vs International) without specifying their concrete classes.

### 3. Factory Pattern
Provides a centralized way to create campaign objects (Email or SMS) based on runtime parameters, encapsulating object creation logic.

### 4. Builder Pattern
Allows step-by-step construction of complex marketing campaign objects with optional parameters, providing flexibility in object creation.

### 5. Adapter Pattern
Enables integration with incompatible third-party advertising APIs (Facebook, Google) by providing a unified interface for ad publishing.

### 6. Bridge Pattern
Decouples advertisement abstraction from its implementation (channels), allowing both to vary independently (ProductAd with EmailChannel or SmsChannel).

### 7. Composite Pattern
Represents campaigns in a tree structure, allowing individual campaigns and groups of campaigns to be treated uniformly.

### 8. Chain of Responsibility
Creates a pipeline of handlers (Validation → AI Processing) where each handler can process or pass the request to the next handler.

### 9. Command Pattern
Encapsulates campaign operations (Launch, Stop) as objects, enabling parameterization, queuing, and undo functionality.

## 📝 Notes

- This is an educational project demonstrating design patterns in practice
- The implementations are simplified for clarity and learning purposes
- In a production environment, additional error handling, logging, and configuration management would be recommended

## 🤝 Contributing

This is a demonstration project. Feel free to fork, modify, and experiment with the code to understand how different design patterns work together.

## 📄 License

This project is provided as-is for educational purposes.

---

**Happy Learning! 🎓**

