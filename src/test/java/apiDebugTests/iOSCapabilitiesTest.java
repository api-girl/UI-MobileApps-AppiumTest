package apiDebugTests;

import org.testng.annotations.Test;
import utils.BaseTest;
import utils.ProjectCapabilities;

import static org.testng.Assert.assertNotNull;

public class iOSCapabilitiesTest extends BaseTest {

    public iOSCapabilitiesTest(){
        caps = ProjectCapabilities.TheAppIOS();
    }

    @Test
    public void testCapabilities(){
        assertNotNull(caps);
    }

}
