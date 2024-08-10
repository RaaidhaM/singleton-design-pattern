public class ConfigurationManager {
    private static final ConfigurationManager instance;

    private ConfigurationManager() {
        System.out.println("ConfigurationManager created");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }
}