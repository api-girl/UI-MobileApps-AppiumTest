package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class BaseTest {

    protected AppiumDriver<WebElement> driver;
    protected DesiredCapabilities caps;
    String serverUrl = "http://localhost:4723/wd/hub";

    protected AppiumDriver<WebElement> getDriver(){
        return this.driver;
    }

    protected String resourcePath(String resourceName){
       return Paths.get(System.getProperty("user.dir"), "src", "test", "resources", resourceName).toString();
    }

    protected String getResourceB64(String fileName) throws IOException{
        Path refImgPath = Paths.get(resourcePath(fileName));
        return Base64.getEncoder().encodeToString(Files.readAllBytes(refImgPath));
    }

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        final URL server = new URL(serverUrl);
        if(caps.getCapability("platformName").equals("Android")){
            this.driver = new AndroidDriver<>(server, caps);
        } else {
            this.driver = new IOSDriver<>(server, caps);
        }
    }


    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}
