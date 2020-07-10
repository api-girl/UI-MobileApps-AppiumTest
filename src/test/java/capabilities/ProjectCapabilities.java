package capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.nio.file.Paths;

public class ProjectCapabilities{

    public static String localApp(String appName){
        return Paths.get(System.getProperty("user.dir"), "apps", appName).toString();
    }

    private static DesiredCapabilities AndroidBase(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("automationName", "UiAutomator2");
        return caps;
    }

    private static DesiredCapabilities IOSBase(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "13.3");
        caps.setCapability("deviceName", "iPhone 11");
        return caps;
    }

    public static DesiredCapabilities TheAppAndroid(){
        DesiredCapabilities caps = AndroidBase();
        caps.setCapability("app", localApp("base.apk"));
        caps.setCapability("appWaitActivity", "com.reactnativenavigation.controllers.NavigationActivity");
        return caps;
    }

    public static DesiredCapabilities TheAppIOS(){
        DesiredCapabilities caps = IOSBase();
        caps.setCapability("app", localApp("TheApp.app.zip"));
        return caps;
    }
}
