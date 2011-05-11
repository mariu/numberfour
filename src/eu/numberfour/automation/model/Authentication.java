//*****************************************************************************
// %name: Authentication.java %
// Desc :
// 
// Copyright (©) n4
// @author  Marius Ghiga
//*****************************************************************************
package eu.numberfour.automation.model;


/**
 * UI model can be per module(authentication, status, etc) or per page
 * Can also contain, in a separate class or not, the locator strings used by Selenium
 */
public class Authentication
{
    private String firstName;
    private String lastName;
    private String email; // username, should be unique identifier
    private String password;
    private Sex sex;
    private Month month;
    int day; // 0 < day < 31, normally this should be validated at creation
    int year; // 1904 < year < 2011, normally this should be validated at creation
    /**
     * @return Returns the firstName.
     */
    public String getFirstName()
    {
        return firstName;
    }
    /**
     * @param firstName The firstName to set.
     */
    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }
    /**
     * @return Returns the lastName.
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * @param lastName The lastName to set.
     */
    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }
    /**
     * @return Returns the email.
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * @param email The email to set.
     */
    public void setEmail( String email )
    {
        this.email = email;
    }
    /**
     * @return Returns the password.
     */
    public String getPassword()
    {
        return password;
    }
    /**
     * @param password The password to set.
     */
    public void setPassword( String password )
    {
        this.password = password;
    }
    /**
     * @return Returns the sex.
     */
    public Sex getSex()
    {
        return sex;
    }
    /**
     * @param sex The sex to set.
     */
    public void setSex( Sex sex )
    {
        this.sex = sex;
    }
    /**
     * @return Returns the month.
     */
    public Month getMonth()
    {
        return month;
    }
    /**
     * @param month The month to set.
     */
    public void setMonth( Month month )
    {
        this.month = month;
    }
    /**
     * @return Returns the day.
     */
    public int getDay()
    {
        return day;
    }
    /**
     * @param day The day to set.
     */
    public void setDay( int day )
    {
        this.day = day;
    }
    /**
     * @return Returns the year.
     */
    public int getYear()
    {
        return year;
    }
    /**
     * @param year The year to set.
     */
    public void setYear( int year )
    {
        this.year = year;
    }
    

}

