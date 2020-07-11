package apiDebugTests;

import org.testng.annotations.Test;
import utils.BaseTest;
import utils.ProjectCapabilities;

import static org.testng.Assert.assertNotNull;

public class AndroidCapabilitesTest extends BaseTest {

    public AndroidCapabilitesTest(){
        caps = ProjectCapabilities.TheTrialApp();
    }

    @Test
    public void testAppLaunching(){

        assertNotNull(caps);
    }


}
