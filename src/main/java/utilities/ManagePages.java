package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.grafana.AddNewUserPage;
import pageObjects.grafana.EditUserPage;
import pageObjects.grafana.ServerAdminMainPage;
import pageObjects.grafana.ServerAdminMenuPage;

public class ManagePages extends Base{

    public static void initGrafana(){
        grafanaLogin = PageFactory.initElements(driver, pageObjects.grafana.LoginPage.class);
        grafanaLeftManu = PageFactory.initElements(driver, pageObjects.grafana.LeftManuPage.class);
        grafanaMain = PageFactory.initElements(driver, pageObjects.grafana.MainPage.class);
        grafanaServarAdminMenu = PageFactory.initElements(driver, ServerAdminMenuPage.class);
        grafanaServarAdminMain = PageFactory.initElements(driver, ServerAdminMainPage.class);
        grafanaAddNewUser = PageFactory.initElements(driver, AddNewUserPage.class);
        grafanaEditUser = PageFactory.initElements(driver, EditUserPage.class);
    }

}
