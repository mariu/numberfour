//*****************************************************************************
// %name: Login.java %
// Desc :
// 
// Copyright n4
// @author  Marius Ghiga
//*****************************************************************************
package eu.numberfour.automation.tests.login;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import eu.numberfour.automation.model.Authentication;
import eu.numberfour.automation.tests.AutomationBase;
import eu.numberfour.automation.tests.login.LoginHelper;
import eu.numberfour.automation.utils.Constants;

public class LoginTest extends AutomationBase{

    
    @Before
    @Override
    public void setUp() throws Exception
    {
      super.setUp();

      
    }

    
    
    @Test
    public void login( ) throws Exception {
        
        // Authentication auth = LoginHelper.singUp( );     
        Authentication auth = new Authentication();
        auth.setEmail( Constants.EMAIL );
        auth.setPassword( Constants.PASSWORD );
        
        Assert.assertTrue( "Should be logged out!", LoginHelper.isLoggedOut( selenium ) );
        LoginHelper.login( auth, selenium );
        Assert.assertTrue( "Should be logged in!", LoginHelper.isLoggedIn( selenium ) );
        LoginHelper.logout( selenium );
        
        auth = new Authentication();
        auth.setEmail( "user_" + System.currentTimeMillis() );
        auth.setPassword( Constants.PASSWORD );
        LoginHelper.login( auth, selenium );
        // assert this failed because of wrong user
        
        auth = new Authentication();
        auth.setEmail( Constants.EMAIL );
        auth.setPassword( "wrong password" );
        LoginHelper.login( auth, selenium );
        // assert this failed because password was incorrect
    }
    
    @After
    @Override
    public void tearDown() throws Exception
    {
      super.tearDown(); 
    }

}
