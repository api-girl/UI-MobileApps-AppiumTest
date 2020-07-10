package tests;

import capabilities.ProjectCapabilities;
import org.testng.annotations.Test;

public class AndroidCapabilitiesTest extends BaseTest {

    public AndroidCapabilitiesTest(){
        caps = ProjectCapabilities.TheAppAndroid();
    }

    @Test
    public void testSetAndroidCapabilities(){

    }
}
