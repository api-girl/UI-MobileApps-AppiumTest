package utils;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.nio.file.Paths;

public class ProjectCapabilitiesAD {

    public static String localPathToApp(String appName){
        return Paths.get(System.getProperty("user.dir"), "apps", appName).toString();
    }

    private static DesiredCapabilities setAndroidCaps(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("automationName", "UiAutomator2"); // "Espresso"
        return caps;
    }

    private static DesiredCapabilities setIosCaps(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "13.3");
        caps.setCapability("deviceName", "iPhone 11");

        return caps;
    }

    public static DesiredCapabilities TheAppAndroid(){
        DesiredCapabilities caps = setAndroidCaps();
        caps.setCapability("app", localPathToApp("General-Store.apk"));
        //caps.setCapability("appWaitActivity", "");
        return caps;
    }

    public static DesiredCapabilities TheAppIOS(){
        DesiredCapabilities caps = setIosCaps();
        caps.setCapability("app", localPathToApp("TheApp.app.zip"));
        return caps;
    }
}
