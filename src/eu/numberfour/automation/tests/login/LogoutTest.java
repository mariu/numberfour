//*****************************************************************************
// %name: Logout.java %
// Desc :
// 
// Copyright (©) n4
// @author  Marius Ghiga
//*****************************************************************************
package eu.numberfour.automation.tests.login;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import eu.numberfour.automation.model.Authentication;
import eu.numberfour.automation.tests.AutomationBase;
import eu.numberfour.automation.utils.Constants;

public class LogoutTest extends AutomationBase{

    @Before
    @Override
    public void setUp() throws Exception
    {
      super.setUp();
    }
    
    @Test
    public void logout() throws Exception {
      
        // Authentication auth = LoginHelper.singUp( ); 
        
        Authentication auth = new Authentication();
        auth.setEmail( Constants.EMAIL );
        auth.setPassword( Constants.PASSWORD );
        
        // if we are here, login is already tested
        LoginHelper.login( auth, selenium );
        Assert.assertTrue( "Should be logged in!", LoginHelper.isLoggedIn() );
        LoginHelper.logout( selenium );
        Assert.assertTrue( "Should be logged out!", LoginHelper.isLoggedOut() );
    }
    
    
    @After
    @Override
    public void tearDown() throws Exception
    {
      super.tearDown(); 
    }

}
