package Utilities; // Package for configuration-related helpers

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties prop; // Object to hold properties from file

    public static Properties getProperties() {
        // Load properties if not already loaded
        if (prop == null) {
            prop = new Properties(); // Create new Properties object
            try (FileInputStream fis = new FileInputStream("src/test/resources/config.properties")) {
                prop.load(fis); // Load key-value pairs from file
            } catch (IOException e) {
                e.printStackTrace(); // Print error if file not found or unreadable
            }
        }
        return prop; // Return the loaded properties
    }

    public static String getProperty(String key) {
        // Fetch value for the given key
        return getProperties().getProperty(key);
    }
}
