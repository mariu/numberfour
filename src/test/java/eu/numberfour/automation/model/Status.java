//*****************************************************************************
// %name: StatusMessage.java %
// Desc :
// 
// Copyright n4
// @author Marius Ghiga
//*****************************************************************************
package test.java.eu.numberfour.automation.model;

public class Status
{
    private String message;
    private Boolean statusChanged;
    
    /**
     * @return Returns the message.
     */
    public String getMessage()
    {
        return message;
    }
    /**
     * @param message The message to set.
     */
    public void setMessage( String message )
    {
        this.message = message;
    }
    /**
     * @return Returns the statusChanged.
     */
    public Boolean getStatusChanged()
    {
        return statusChanged;
    }
    /**
     * @param statusChanged The statusChanged to set.
     */
    public void setStatusChanged( Boolean statusChanged )
    {
        this.statusChanged = statusChanged;
    }
    
    

}
