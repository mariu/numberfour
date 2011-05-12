// *****************************************************************************
// %name: AutomationBase.java %
// Desc :
//
// Copyright (©) n4
// @author Marius Ghiga
// *****************************************************************************
package eu.numberfour.automation.tests;

import org.junit.After;
import org.junit.Before;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import eu.numberfour.automation.utils.Constants;



/**
 * This is extended by all test classes
 * Should contain utility methods related so selenium, 
 * eventually override some default selenium behavior by extending DefaultSelenium class
 */
public class AutomationBase
{

    protected Selenium selenium;

    @Before
    public void setUp() throws Exception
    {
        
        startSelenium( Constants.SELENIUM_SERVER_HOST, Constants.SELENIUM_SERVER_PORT, Constants.BROSER_TYPE, Constants.BASE_URL );
        // startSeleniumSauceLabs();
    }
    
    @After
    public void tearDown() throws Exception
    {
        stopSelenium();
    }
    
    
    protected void startSelenium( String serverLocation, int serverPort, String browserType, String baseUrl )
    {
        selenium = new DefaultSelenium( serverLocation, serverPort, browserType, baseUrl );
        selenium.start();
        selenium.setSpeed( Constants.SPEED );
        open( baseUrl );
        selenium.windowFocus();
        selenium.windowMaximize();
    }
    
    protected void startSeleniumSauceLabs ()
    {
          selenium = new DefaultSelenium (
                              "ondemand.saucelabs.com",
                              80,
                              "{\"username\": \"mariu\"," +
                              "\"access-key\": \"14d6410d-acab-41a9-81b8-b16bf98ab44d\"," +
                              "\"os\": \"Windows 2003\"," +
                              "\"browser\": \"firefox\"," +
                              "\"browser-version\": \"3.6.\"," +
                              "\"name\": \"Facebook\"}",
                              "http://facebook.com/");
          selenium.start();
          open( "http://facebook.com/" );
    }
    
    protected void stopSelenium()
    {
        if ( selenium != null )
        {
            selenium.stop();
        }
    }

    protected void open( String url )
    {
        selenium.open( url );
        selenium.waitForPageToLoad( Constants.WAIT_TO_LOAD_TIME );
    }

//    static
//    {
//        Runtime.getRuntime().addShutdownHook( new Thread( new Runnable()
//        {
//            public void run()
//            {
//                if ( selenium != null )
//                {
//                    selenium.stop();
//                    selenium = null;
//                }
//            }
//        } ) );
//
//        selenium = new MySelenium( "localhost", 4444, "*firefox", "http://www.facebook.com/" );
//        // selenium = new MySelenium(
//        // "ondemand.saucelabs.com",
//        // 80,
//        // "{\"username\": \"mariu\"," +
//        // "\"access-key\": \"14d6410d-acab-41a9-81b8-b16bf98ab44d\"," +
//        // "\"os\": \"Windows 2003\"," +
//        // "\"browser\": \"firefox\"," +
//        // "\"browser-version\": \"3.6.\"," +
//        // "\"name\": \"Facebook\"}",
//        // "http://facebook.com/");
//        selenium.start();
//        selenium.setSpeed( Constants.SPEED );
//    }

}
