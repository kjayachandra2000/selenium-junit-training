package property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

    public static String get(String key) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/test/java/property/config.properties"));
            return properties.getProperty(key);
        } catch (IOException ex) {
            throw new RuntimeException("unable load property file");
        }
    }
}
