package core.ui.pages;

import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasePage {
    private String baseUrl;
    private String message = "Set baseUrl to: " + this.baseUrl;
    private final Logger logger = LogManager.getLogger("log4j2.xml");

    public BasePage open() {
        Selenide.open(this.baseUrl);
        return this;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        this.logger.info(message);
    }

    public void back() {
        Selenide.back();
    }

    public void forward() {
        Selenide.forward();
    }

}
