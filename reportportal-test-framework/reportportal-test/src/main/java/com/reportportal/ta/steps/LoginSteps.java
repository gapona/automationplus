package com.reportportal.ta.steps;

import com.reportportal.ta.pages.LoginPage;
import com.reportportal.ta.core.ui.steps.BaseUiSteps;
import com.epam.reportportal.annotations.Step;

public class LoginSteps extends BaseUiSteps {
    public static LoginPage loginPage = new LoginPage();

    @Step
    public static void inputUsername() {
        getLogger().info("input username step");
        loginPage.getUserName().sendKeys(props.getProperty("user.username"));
    }

    @Step

    public static void inputPassword() {
        getLogger().info("input password step");
        loginPage.getPassword().sendKeys(props.getProperty("user.password"));
    }
}



