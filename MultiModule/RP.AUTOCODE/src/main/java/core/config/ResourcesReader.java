package core.config;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Log4j2
@NoArgsConstructor
public class ResourcesReader {
    private final Logger logger = LogManager.getLogger("log4j2.xml");
    public Properties loadPropertiesFile(String filePath) {
        Properties properties = new Properties();
        String message = "Unable to load properties file : " + filePath;
        try (InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(filePath)) {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            this.logger.error(message);
        }
        return properties;
    }
}
