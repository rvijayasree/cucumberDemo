package se.thinkcode;

import com.sainsburys.DriveManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Vijayasree on 15/08/16.
 */
public class Hooks {

    DriveManager driveManager=new DriveManager();

    @Before
    public void setUp(){
        driveManager.openBrowser();
    }

    @After
    public void tearDown(){
        driveManager.closeBrowser();
    }

}
