package com.testing.frameworkautojava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.safari.SafariDriver;


public class driverfactory {

   public static WebDriver driver ;

    public static WebDriver getDriver(String browser) {

        switch (browser) {
                case "Chrome":
                    System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
                    driver=new ChromeDriver();
                    break;
                case "Safari":
                    System.setProperty("webdriver.safari.driver", "src/drivers/safaridriver");
                    driver=new SafariDriver();
                    break;

                default:
                    System.setProperty("webdriver.firefox.driver", "src/drivers/geckodriver");
                    driver=new FirefoxDriver();
                    break;


        }
        return driver;

    }



}
