package screenObjects;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screen {
    WebDriver driver;
    WebDriverWait wait;


    public Screen(WebDriver driver) {
        this.driver = driver;
    }

    public void typeText(By locator, String text) {
        waitForElementPresence(5, locator);
        driver.findElement(locator).sendKeys(text);

    }

    public void waitAndTap(By locator){
        waitForElementPresence(4, locator);
        driver.findElement(locator).click();
    }


    private void waitForElementPresence(int timeout, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public boolean isElementDisplayed(By locator){
        waitForElementPresence(3, locator);
        return driver.findElement(locator).isDisplayed();
    }

    public String getElementText(By locator){
        waitForElementPresence(4, locator);
        return driver.findElement(locator).getText();
    }
}
