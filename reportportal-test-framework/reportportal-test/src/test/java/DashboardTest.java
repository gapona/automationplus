import com.epam.reportportal.junit5.ReportPortalExtension;
import com.reportportal.ta.pages.DashboardPage;
import com.reportportal.ta.steps.DashboardSteps;
import com.reportportal.ta.core.utils.custom_annotations.Owner;
import com.reportportal.ta.core.utils.custom_annotations.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.reportportal.ta.core.utils.enums.SeverityLevels.MAJOR;

public class DashboardTest extends BaseTest {
    private static DashboardPage dashboardPage = new DashboardPage();

    @Owner("Andrii Hapon")
    @Severity(level = MAJOR)
    @DisplayName("positive")
    @Test
    @ExtendWith(ReportPortalExtension.class)
    void createAndDeleteDashboardTest() {
        getLogger().info("dashboard test run");
        dashboardPage.getAddNewDashboardButtonInBar().click();
        DashboardSteps.fillNameAndDesciptionForNewDashboard();
        dashboardPage.getAddNewDashboardButtonInPopUp().click();
        DashboardSteps.deleteDashboard();
    }
}


