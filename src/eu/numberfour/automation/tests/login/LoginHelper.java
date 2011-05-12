//*****************************************************************************
// %name: LoginHelper.java %
// Desc :
// 
// Copyright (©) n4
// @author  Marius Ghiga
//*****************************************************************************
package eu.numberfour.automation.tests.login;

import org.junit.Assert;

import com.thoughtworks.selenium.Selenium;

import eu.numberfour.automation.model.Authentication;
import eu.numberfour.automation.model.Month;
import eu.numberfour.automation.utils.Constants;

public class LoginHelper
{
    /**
     * @param auth
     * @param selenium
     */
    public static void login( final Authentication auth, final Selenium selenium )
    {
        // validations: just message not asserts ?
        if ( auth == null )
        {
            System.err.println( "Authentication object is null" );
            Assert.fail( "Authentication object is null" );
        }
        
        if ( auth.getEmail() == null || auth.getEmail().isEmpty() )
        {
            Assert.fail( "Email string is null or empty" );
        }
        
        if ( auth.getPassword() == null || auth.getPassword().isEmpty() )
        {
            Assert.fail( "Password string is null or empty" );
        }
        
        selenium.type("email", auth.getEmail() );
        selenium.type("pass", auth.getPassword() );

        selenium.click("//input[@value='Login']");
        selenium.waitForPageToLoad( Constants.WAIT_TO_LOAD_TIME );
    }
    
    /**
     * @param selenium
     * @throws Exception
     */
    public static void logout( final Selenium selenium ) throws Exception 
    {    
        selenium.click("//li[@id='navAccount']/a[@id='navAccountLink']");
        selenium.click("//li[@id='navAccount']/ul/li/form[@id='logout_form']/label/input");
        selenium.waitForPageToLoad( Constants.WAIT_TO_LOAD_TIME );
    }
    
    /**
     * @return
     */
    public static Boolean isLoggedIn ( Selenium selenium )
    {
        Boolean result = true;

        if ( !selenium.isElementPresent( "link=Home" ) || !selenium.isElementPresent( "//input[@value='Logout']" ) )
        {
            result = false;
        }

        return result;
    }
    
    /**
     * @return
     */
    public static Boolean isLoggedOut ( Selenium selenium )
    {
        Boolean result = true;

        if ( !selenium.isElementPresent( "link=exact:Forgot your password?" ) || !selenium.isElementPresent( "//input[@value='Login']" ) )
        {
            result = false;
        }

        return result;
    }
    
    /**
     * Just a draft
     * @return
     */
    public static Authentication signUp ()
    {
        Authentication auth = new Authentication();
        auth.setFirstName( "John" );
        auth.setLastName( "Doe" );
        auth.setEmail( "email_" + System.currentTimeMillis() + "@yahoo.com" ); // this has to be unique id for facebook
        auth.setPassword( Constants.PASSWORD );
        auth.setMonth( Month.Jan );
        auth.setDay( 1 );
        auth.setYear( 1996 );

        auth = signUp ( auth );
        
        return auth;
    }
    
    /**
     * Just a draft
     * @param auth
     * @return
     */
    public static Authentication signUp ( Authentication auth )
    {
        
        // do selenium staff for signing up, etc and if successful return the Authentication, otherwise null
        return auth;
    }
}
