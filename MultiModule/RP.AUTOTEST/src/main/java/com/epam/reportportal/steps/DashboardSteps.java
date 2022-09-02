package com.epam.reportportal.steps;

import core.ui.steps.BaseUiSteps;
import com.epam.reportportal.annotations.Step;
import com.epam.reportportal.pages.DashboardPage;

public class DashboardSteps extends BaseUiSteps {

    private static DashboardPage dashboardPage = new DashboardPage();

    @Step
    public static void fillNameAndDesciptionForNewDashboard() {
        getLogger().info("fill name and description for new dashboard step");
        dashboardPage.getDashboardName().sendKeys(props.getProperty("dashboard.name"));
        dashboardPage.getDashboardDescription().sendKeys(props.getProperty("dashboard.description"));
    }

    @Step
    public static void deleteDashboard() {
        getLogger().info("delete dashboard step");
        dashboardPage.getDeleteDashboardButtonOnBar().click();
        dashboardPage.getDeleteDashboardButtonInPopUp().click();
    }

}
