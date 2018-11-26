package com.testing.frameworkautojava;

import org.openqa.selenium.WebDriver;

import java.net.URL;

public class ManageTest {


   private static  driverfactory driverfactory;
   protected static ReusableFunctions testWebDriver;

    public ManageTest()
    {
        driverfactory = new driverfactory(); //creates the driver object present in driver class
        String browser=readconfigfile.getBrowser();  // loads the browser into that driver
        WebDriver test=driverfactory.getDriver(browser);   //calls the driver with browser and intialises a ref variable with it
        testWebDriver= new ReusableFunctions(test);  //it goes into an object of reusable class so that functions can be used of this class
        testWebDriver.start(readconfigfile.getURL());


    }
  public void setup() throws InterruptedException {
      System.out.println("I have reached the start ");

  }
    public void teardown()
    {
        testWebDriver.quitDriver();
    }


}
