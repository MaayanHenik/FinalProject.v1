package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ServerAdminMainPage {

    @FindBy(how = How.XPATH, using = "//td[@class='link-td max-width-10']/a[@title='admin@localhost']")
    public List<WebElement> rows;

    @FindBy(how = How.XPATH, using = "//a[@class='css-1sara2j-button']")
    public WebElement btn_newUser;

}

