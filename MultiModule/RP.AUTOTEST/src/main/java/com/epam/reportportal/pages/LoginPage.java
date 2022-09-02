package com.epam.reportportal.pages;

import com.codeborne.selenide.SelenideElement;
import core.ui.pages.BasePage;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
@Getter
@NoArgsConstructor
public class LoginPage extends BasePage {

    private SelenideElement userName = $(By.name("login"));
    private SelenideElement password = $(By.name("password"));
    private SelenideElement submitButton = $(By.xpath("//button[@type='submit']"));

}
