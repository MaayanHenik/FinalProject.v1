package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditUserPage {

    @FindBy(how = How.XPATH, using = "//div[@class='css-kdj7v3']/button[@class='css-mk7eo3-button']")
    public WebElement btn_deleteUser;

    @FindBy(how = How.XPATH, using = "//div[@class='css-4bnqyk-horizontal-group']/div[@class='css-1pvl9up-layoutChildrenWrapper'][2]")
    public WebElement btn_confirmDeleteUser;

}
