package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    public void sendKeysFunction(WebElement element, String text)
    {

        waitUntilVisible(element);  // gozukene kadar bekle
        scrollToElement(element);  // scroll yap
        element.clear();           // temizle
        element.sendKeys(text);    // gonder
    }

    public  void clickFunction(WebElement element)
    {

        waitUntilClickable(element);
        scrollToElement(element);
        element.click();

    }

    public void verifyContainsTextFunction(WebElement element, String value)
    {

        wait.until(ExpectedConditions.textToBePresentInElement(element, value));

        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()), "No such text");

    }

    public void scrollToElement(WebElement element)
    {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    public void waitUntilVisible(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}

