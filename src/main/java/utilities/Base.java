package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageObjects.grafana.AddNewUserPage;
import pageObjects.grafana.EditUserPage;
import pageObjects.grafana.ServerAdminMenuPage;
import pageObjects.grafana.ServerAdminMainPage;

public class Base {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static Screen screen;

    //Pages Objects
    protected static pageObjects.grafana.LoginPage grafanaLogin;
    protected static pageObjects.grafana.LeftManuPage grafanaLeftManu;
    protected static pageObjects.grafana.MainPage grafanaMain;
    protected static ServerAdminMenuPage grafanaServarAdminMenu;
    protected static ServerAdminMainPage grafanaServarAdminMain;
    protected static AddNewUserPage grafanaAddNewUser;
    protected static EditUserPage grafanaEditUser;
}
