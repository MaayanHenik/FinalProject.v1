package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftManuPage {

    @FindBy(how = How.XPATH, using = "//button[@class='css-5n5dhy']")
    public WebElement btn_navigationMenu;

    @FindBy(how = How.XPATH, using = "//ul[@class='css-19h5az5']/li[@class='css-5aou1s'][5]")
    public WebElement btn_server;

    @FindBy(how = How.XPATH, using = "//ul[@class='css-19h5az5']/li[@class='css-5aou1s'][3]")
    public WebElement btn_alerting;

    @FindBy(how = How.XPATH, using = "//ul[@class='css-19h5az5']/li[@class='css-5aou1s'][4]")
    public WebElement btn_configuration;

}
