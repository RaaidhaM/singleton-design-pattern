public class ConfigurationManager {
    private static final ConfigurationManager instance = new ConfigurationManager();

    private ConfigurationManager() {
        System.out.println("ConfigurationManager created");
    }

    public static ConfigurationManager getInstance() {
        return instance;
    }
}