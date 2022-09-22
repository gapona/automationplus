import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.reportportal.ta.core.config.ResourcesReader;
import com.reportportal.ta.core.utils.Constants;
import com.reportportal.ta.pages.LoginPage;
import com.reportportal.ta.steps.LoginSteps;
import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

@Getter
abstract public class BaseTest {

    private static final ResourcesReader resourcesReader = new ResourcesReader();
    private static final Constants constants = new Constants();
    private static final Properties props = resourcesReader.loadPropertiesFile(constants.getFILE_PATH());
    private final Logger logger = LogManager.getLogger("log4j2.xml");
    private final LoginPage loginPage = new LoginPage();
    private static final ThreadLocal<WebDriver> driverInstances = new ThreadLocal<>();

    @BeforeAll
    public static void setUp() {
        Configuration.browser = (props.getProperty("browser.type"));
    }

    @BeforeEach
    public void login() {
        loginPage.setBaseUrl(props.getProperty("login.url"));
        loginPage.open();
        LoginSteps.inputUsername();
        LoginSteps.inputPassword();
        loginPage.getSubmitButton().click();
        logger.info("login successful");
    }

    @AfterEach
    public void cleanUp() {
        Selenide.closeWebDriver();
    }
}
