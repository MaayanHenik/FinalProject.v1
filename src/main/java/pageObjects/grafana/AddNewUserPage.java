package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.CommonOps;

public class AddNewUserPage extends CommonOps {

    @FindBy(how = How.XPATH, using = "//input[@id='name-input']")
    public WebElement txt_name;

    @FindBy(how = How.XPATH, using = "//input[@id='email-input']")
    public WebElement txt_email;

    @FindBy(how = How.XPATH, using = "//input[@id='username-input']")
    public WebElement txt_userName;

    @FindBy(how = How.XPATH, using = "//input[@id='password-input']")
    public WebElement txt_password;

    @FindBy(how = How.XPATH, using = "//button[@class='css-1sara2j-button']")
    public WebElement btn_submit;

}
