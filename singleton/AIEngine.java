package singleton;

public class AIEngine {

    private static AIEngine instance;

    private AIEngine() {
        System.out.println("AI Model Loaded");
    }

    public static synchronized AIEngine getInstance() {
        if (instance == null) {
            instance = new AIEngine();
        }
        return instance;
    }

    public void analyzeCustomer() {
        System.out.println("Analyzing customer behavior using AI");
    }
}
