package screenObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationScreen extends Screen {
private By confirmatonContent = By.id("android:id/content");

    public ConfirmationScreen(WebDriver driver) {
        super(driver);
    }

    public boolean getConfMessage() {
        return isElementDisplayed(confirmatonContent);
    }
}
