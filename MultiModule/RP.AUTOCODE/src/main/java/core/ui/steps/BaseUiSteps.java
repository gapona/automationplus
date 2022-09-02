package core.ui.steps;

import core.config.ResourcesReader;
import core.utils.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;


public abstract class BaseUiSteps {

    protected BaseUiSteps() {
    }

    public static final ResourcesReader resourcesReader = new ResourcesReader();
    public static final Constants constants = new Constants();
    public static final Properties props = resourcesReader.loadPropertiesFile(constants.getFILE_PATH());

    public static final Logger getLogger() {
        return logger;
    }

    private static final Logger logger = LogManager.getLogger("log4j2.xml");

}
