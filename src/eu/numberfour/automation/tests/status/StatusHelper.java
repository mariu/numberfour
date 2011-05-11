//*****************************************************************************
// %name: StatusHelper.java %
// Desc :
// 
// Copyright (©) camLine GmbH
// @author  
//*****************************************************************************
package eu.numberfour.automation.tests.status;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import com.thoughtworks.selenium.Selenium;

import eu.numberfour.automation.utils.Constants;

public class StatusHelper
{
    
    /**
     * @throws Exception
     */
    public static void changeStatus ( Selenium selenium ) throws Exception 
    {
        // Pressing 'News Feed' link again as this might not always be the default selected page
        selenium.open("/?sk=nf");
        selenium.waitForPageToLoad(Constants.WAIT_TO_LOAD_TIME);
        selenium.click("//li[@id='navItem_nf']/a/span[3]");
        selenium.waitForPageToLoad("30000");
        String expectedText = new Date().toString();
        selenium.type("//div[@id='contentArea']/div[@id='pagelet_composer']/div/div/div/form/div[2]/div[1]/div/div/div[1]/div/textarea", expectedText);
        selenium.click("link=Everyone");
        selenium.click("link=Friends of Friends");
        selenium.click("//div/div/div/ul/li[2]/a/span");
        selenium.click("//input[@value='Share']");

        Thread.sleep( 1000 ); // remember 'waitForTextPresent'
        
        selenium.isTextPresent(expectedText);
        String actualText = selenium.getText( "//ul[@id='home_stream']/li/div/div/div/div/h6/span");
        assertEquals( "Status message not found: ", expectedText, actualText );
        
        // TODO: move verification to a separate method
        
    }
    
    public static Boolean checkStatusMessageIsAdded (Selenium selenium, String message )
    {
        return true;
    }
    
    public static void removeStatusMessage ( Selenium selenium ) throws Exception
    {
        // xpath count
        // parse...and identify, then remove
    }

}
