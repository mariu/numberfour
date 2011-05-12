// *****************************************************************************
// %name: AllTests.java %
// Desc :
//
// Copyright n4
// @author Marius Ghiga
// *****************************************************************************
package test.java.eu.numberfour.automation.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.java.eu.numberfour.automation.tests.login.LoginTest;
import test.java.eu.numberfour.automation.tests.login.LogoutTest;
import test.java.eu.numberfour.automation.tests.status.ChangeStatusTest;


// specify a runner class: Suite.class
@RunWith ( Suite.class )
// specify an array of test classes
@Suite.SuiteClasses ( { LoginTest.class, LogoutTest.class, ChangeStatusTest.class } )
// the actual class is empty
public class AllTests
{
}

// java -cp .;junit-4.4.jar org.junit.runner.JUnitCore AllTests

