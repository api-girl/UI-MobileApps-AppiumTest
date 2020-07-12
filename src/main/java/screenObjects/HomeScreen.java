package screenObjects;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeScreen extends Screen{
    private By login = MobileBy.AccessibilityId("Login Screen");

    public HomeScreen(WebDriver driver){
        super(driver);
    }

    public LoginScreen goToLoginScreen(){
        waitAndTap(login);
        return new LoginScreen(driver);
    }

}
