package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServerAdminMenuPage {

    @FindBy(how = How.XPATH, using = "//li[@class='css-z7s2w9']/a[@href='/admin/users']")
    public WebElement link_users;

    @FindBy(how = How.XPATH, using = "//li[@class='css-z7s2w9']/a[@href='/admin/orgs']")
    public WebElement link_orgs;

    @FindBy(how = How.XPATH, using = "//li[@class='css-z7s2w9']/a[@href='/admin/settings']")
    public WebElement link_settings;

}
