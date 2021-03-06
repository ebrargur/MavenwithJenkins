package com.hrms.stepdefinitions;

import com.hrms.testcases.BaseClass;
import com.hrms.utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    //Annotation based
    //they will be executed before openin browser and after executing your test
    @Before
    public void startTest()
    {
        BaseClass.setUp();
    }
    @After
    public void endTest(Scenario scenario)//scenario is a class
    {
       /* byte[] screenshot;
        if (scenario.isFailed())
        {
           screenshot=CommonMethods.takeScreenshot("failed/"+ scenario.getName());
            //this will return name of the scenario class
        }
        else
        {
            screenshot=CommonMethods.takeScreenshot("passed/"+ scenario.getName());

        }
        scenario.attach(screenshot, "image/png", scenario.getName());
*/
        BaseClass.tearDown();
    }
}
