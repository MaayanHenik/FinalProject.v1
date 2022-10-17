package grafanaSanity;


import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.WebFlows;


@Listeners(utilities.Listeners.class)
public class GrafanaWeb extends CommonOps {

    @Test(description = "Test01 - Verify Header")
    @Description("This test login and verifies the main header")
    public void test01_verifyHeader(){
        WebFlows.login("admin", "admin");
        Verifications.verifyTestInElement(grafanaMain.head_Dashboard, "Welcome to Grafana");
    }

    @Test(description = "Test02 - Verify Default Users")
    @Description("This test verifies the default users")
    public void test02_verifyDefaultUsers(){
        UIActions.click(grafanaLeftManu.btn_navigationMenu);
        UIActions.click(grafanaLeftManu.btn_server);
        UIActions.click(grafanaServarAdminMenu.link_users);
        Verifications.numberOfElements(grafanaServarAdminMain.rows, 1);
    }

    @Test(description = "Test03 - Verify New User")
    @Description("This test verifies a new user has been added")
    public void test03_verifyNewUser(){
        UIActions.click(grafanaLeftManu.btn_navigationMenu);
        UIActions.click(grafanaLeftManu.btn_server);
        UIActions.click(grafanaServarAdminMenu.link_users);

        WebFlows.createNewUser("Marina", "marinahenik@mylove.com", "Marina Henik", "Marina123!");
        Verifications.numberOfElements(grafanaServarAdminMain.rows, 2);
    }

    @Test(description = "Test04 - Verify User Deletion")
    @Description("This test verifies the deletion of a user")
    public void test04_verifyUserDeletion(){
        UIActions.click(grafanaLeftManu.btn_navigationMenu);
        UIActions.click(grafanaLeftManu.btn_server);
        UIActions.click(grafanaServarAdminMenu.link_users);

        WebFlows.deleteLastUser();
        Verifications.numberOfElements(grafanaServarAdminMain.rows, 2);
    }

    @Test(description = "Test05 - Verify Progress Steps")
    @Description("This test verifies the default progress steps are been displayed (Soft-Assertion)")
    public void test05_verifyProgressSteps(){
        Verifications.visibilityOfElements(grafanaMain.list_progressSteps);
    }

}
