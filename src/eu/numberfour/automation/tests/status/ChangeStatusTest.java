//*****************************************************************************
// %name: ChangeStatus.java %
// Desc :
// 
// Copyright n4
// @author Marius Ghiga
//*****************************************************************************
package eu.numberfour.automation.tests.status;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        
        Format formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss Z");
        String message = formatter.format( new Date() );
        
        StatusHelper.changeStatus( selenium, message );  
        
        StatusHelper.checkStatusMessageIsAdded( selenium, message );
        StatusHelper.removeStatusMessage( selenium );
        
        LoginHelper.logout( selenium );
    }

    
    
    @After
    @Override
    public void tearDown() throws Exception
    {
      super.tearDown(); 
    }
}

