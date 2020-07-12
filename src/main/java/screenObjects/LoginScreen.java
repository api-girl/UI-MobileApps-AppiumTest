package screenObjects;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginScreen extends Screen{
private By uField = MobileBy.AccessibilityId("username");
private By pField = MobileBy.AccessibilityId("password");
private By button = MobileBy.AccessibilityId("loginBtn");
private By alertMessage = By.id("android:id/message");

    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    public ConfirmationScreen login(String username, String password){
        typeText(uField, username);
        typeText(pField, password);
        waitAndTap(button);
        return new ConfirmationScreen(driver);
    }

    public String getAlert(){
        return getElementText(alertMessage);
    }
}
