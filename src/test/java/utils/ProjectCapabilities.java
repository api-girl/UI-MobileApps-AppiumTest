package utils;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.nio.file.Paths;

public class ProjectCapabilities {

    public static String localPathToApp(String appName){
        return Paths.get(System.getProperty("user.dir"), "apps", appName).toString();
    }

    public static String localPathToWhatsApp(String appName){
        return Paths.get(System.getProperty("user.dir"), "apps", "WhatsApp", appName).toString();
    }


    private static DesiredCapabilities setAndroidCaps(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
//        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("deviceName", "Google Nexus 6P");
        caps.setCapability("udid", "84B7N15A19001094");
        caps.setCapability("automationName", "UiAutomator2"); // "Espresso"UiAutomator2
        caps.setCapability("forceEspressoRebuild", true);
        return caps;
    }

    private static DesiredCapabilities setIosCaps(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "13.3");
        caps.setCapability("deviceName", "iPhone 11");

        return caps;
    }

    public static DesiredCapabilities GeneralStoreAndroid(){
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

    public static DesiredCapabilities TheTrialApp(){
        DesiredCapabilities caps = setAndroidCaps();
        caps.setCapability("app", localPathToApp("TheApp.apk"));
        return caps;
    }

    public static DesiredCapabilities TheWhatsApp(){
        DesiredCapabilities caps = setAndroidCaps();
        caps.setCapability("app", localPathToWhatsApp("base.apk"));
        return caps;
    }
}
