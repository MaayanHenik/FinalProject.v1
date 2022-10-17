package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class Verifications extends CommonOps {
    @Step("Verify Text In Element")
    public static void verifyTestInElement(WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    @Step("Verify Number Of Elements")
    public static void numberOfElements(List<WebElement> elems, int expected){
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        assertEquals(elems.size(), expected);
    }

    @Step("Verify Visibility Of Element (Soft-Assertion)")
    public static void visibilityOfElements(List<WebElement> elems){
        for(WebElement elem : elems){
            softAssert.assertTrue(elem.isDisplayed(), "Sorry" + elem + "not displayed.");
        }
        softAssert.assertAll("Some elements were not displayed");
    }

}
