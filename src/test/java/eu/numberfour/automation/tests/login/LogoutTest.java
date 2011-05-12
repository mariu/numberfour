//*****************************************************************************
// %name: Logout.java %
// Desc :
// 
// Copyright n4
// @author  Marius Ghiga
//*****************************************************************************
package test.java.eu.numberfour.automation.tests.login;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import test.java.eu.numberfour.automation.model.Authentication;
import test.java.eu.numberfour.automation.tests.AutomationBase;
import test.java.eu.numberfour.automation.utils.Constants;


public class LogoutTest extends AutomationBase{

    @Before
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        // here we can overwrite functionality from AutomationBase class
    }
    
    @Test
    public void logout() throws Exception {
      
        // Authentication auth = LoginHelper.singUp( ); 
        
        Authentication auth = new Authentication();
        auth.setEmail( Constants.EMAIL );
        auth.setPassword( Constants.PASSWORD );
        
        // if we are here, login is already tested
        LoginHelper.login( auth, selenium );
        Assert.assertTrue( "Should be logged in!", LoginHelper.isLoggedIn( selenium ) );
        LoginHelper.logout( selenium );
        Assert.assertTrue( "Should be logged out!", LoginHelper.isLoggedOut( selenium ) );
    }
    
    
    @After
    @Override
    public void tearDown() throws Exception
    {
        // here we can overwrite functionality from AutomationBase class
        super.tearDown();
    }

}
