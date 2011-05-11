//*****************************************************************************
// %name: ChangeStatus.java %
// Desc :
// 
// Copyright (©) n4
// @author Marius Ghiga
//*****************************************************************************
package eu.numberfour.automation.tests.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.numberfour.automation.model.Authentication;
import eu.numberfour.automation.tests.AutomationBase;
import eu.numberfour.automation.tests.login.LoginHelper;
import eu.numberfour.automation.utils.Constants;

public class ChangeStatusTest extends AutomationBase {
    
    
    @Before
    @Override
    public void setUp() throws Exception
    {
      super.setUp();

      
    }
    
    @Test
    public void changeStatus() throws Exception {
        
        // Authentication auth = LoginHelper.singUp( ); 
        Authentication auth = new Authentication();
        auth.setEmail( Constants.EMAIL );
        auth.setPassword( Constants.PASSWORD );
        
        
        LoginHelper.login( auth, selenium );
        StatusHelper.changeStatus( selenium );       
        LoginHelper.logout( selenium );
// TODO: add verifications        
        
    

    }

    
    
    @After
    @Override
    public void tearDown() throws Exception
    {
      super.tearDown(); 
    }
}

