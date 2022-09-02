package com.epam.reportportal.pages;

import com.codeborne.selenide.SelenideElement;

import core.ui.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
@Getter
public class DashboardPage extends BasePage {

    private SelenideElement addNewDashboardButtonInBar = $(By.xpath("//*[contains(text(),'Add New Dashboard')]"));
    private SelenideElement dashboardName = $(By.xpath("//input[@placeholder='Enter dashboard name']"));
    private SelenideElement dashboardDescription = $(By.xpath("//textarea[@placeholder='Enter dashboard description']"));
    private SelenideElement addNewDashboardButtonInPopUp = $(By.xpath(".//button[contains(text(),'Add')]"));
    private SelenideElement deleteDashboardButtonOnBar = $(By.xpath(".//span[contains(text(),'Delete')]"));
    private SelenideElement deleteDashboardButtonInPopUp = $(By.xpath(".//button[contains(text(),'Delete')]"));

}
