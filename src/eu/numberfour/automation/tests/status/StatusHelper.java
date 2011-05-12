// *****************************************************************************
// %name: StatusHelper.java %
// Desc :
//
// Copyright n4
// @author
// *****************************************************************************
package eu.numberfour.automation.tests.status;

import static org.junit.Assert.assertEquals;

import com.thoughtworks.selenium.Selenium;

import eu.numberfour.automation.utils.Constants;

public class StatusHelper
{

    /**
     * @throws Exception
     */
    public static void changeStatus( Selenium selenium, String message ) throws Exception
    {
        // Pressing 'News Feed' link again as this might not always be the default selected page
        // Eventually press Home button before
        selenium.open( "/?sk=nf" );
        selenium.waitForPageToLoad( Constants.WAIT_TO_LOAD_TIME );
        selenium.click( "//li[@id='navItem_nf']/a/span[3]" );
        selenium.waitForPageToLoad( Constants.WAIT_TO_LOAD_TIME );
        
        selenium.type( "//div[@id='contentArea']/div[@id='pagelet_composer']/div/div/div/form/div[2]/div[1]/div/div/div[1]/div/textarea", message );
        selenium.click( "link=Everyone" );
        selenium.click( "link=Friends of Friends" );
        selenium.click( "//div/div/div/ul/li[2]/a/span" );
        selenium.click( "//input[@value='Share']" );

        Thread.sleep( 1000 ); // change this, remember 'waitForTextPresent'

        StatusHelper.checkStatusMessageIsAdded( selenium, message );
        StatusHelper.removeStatusMessage( selenium );

    }

    public static Boolean checkStatusMessageIsAdded( Selenium selenium, String message )
    {
        // this only checks for the first 'div'
        // to make it more general, use xpathcount and search for all 'div' messages
        // then iterate to find the nedded one
        
        selenium.isTextPresent( message );
        String actualMessage = selenium.getText( "//ul[@id='home_stream']/li/div/div/div/div/h6/span" );
        assertEquals( "Status message not found: ", message, actualMessage );
        
        return true; // not useful for now
    }

    public static void removeStatusMessage( Selenium selenium ) throws Exception
    {
        // xpath count
        // parse...and identify, then remove
    }

}
