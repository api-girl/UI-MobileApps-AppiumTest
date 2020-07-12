package apiDebugTests;

import org.testng.annotations.Test;
import screenObjects.ConfirmationScreen;
import screenObjects.HomeScreen;
import screenObjects.LoginScreen;
import utils.BaseTest;
import utils.ProjectCapabilities;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class AndroidLoginTest extends BaseTest {

    public AndroidLoginTest(){
        caps = ProjectCapabilities.TheTrialApp();
    }

    @Test
    public void testLogin_InvalidCredentials(){
        HomeScreen hs = new HomeScreen(driver);
        LoginScreen ls = hs.goToLoginScreen();
        ls.login("alice", "demo");
        var alert = ls.getAlert();

        assertEquals(alert, "Invalid login credentials, please try again", "The expected alert is not displayed.");
    }

    @Test
    public void testLogin_ValidCredentials(){
        String username = "alice";
        HomeScreen hs = new HomeScreen(driver);
        LoginScreen ls = hs.goToLoginScreen();
        ConfirmationScreen cs = ls.login(username, "mypassword");
        boolean isDisplayed = cs.getConfMessage();

        assertTrue(isDisplayed, "The confirmation screen is displayed.");

    }
}
