package com.testing.frameworkautojava;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;
import com.testing.frameworkautojava.readconfigfile;

import java.util.ArrayList;

public class ReusableFunctions {

    private static WebDriver driver;
    public static long PAGE_LOADTIMEOUT= 20;

       public void start (String url){
           driver.get(url);
       }


    public ReusableFunctions(WebDriver driver) {
           this.driver = driver;
       }





    public boolean scrollToElement (WebElement element)
       {

           try {

               JavascriptExecutor js = (JavascriptExecutor) driver;
               js.executeScript("arguments[0].scrollIntoView();", element);
           } catch (Exception e) {

               Assert.fail("The element " + element.getText() + "is not  found");
               return false;
           }

           return true;
       }

    public String verifyPageTitle()
    {
        return driver.getTitle();
    }

       public void waitForElementToBeEnabled (WebElement element)
       {
           WebDriverWait wait = new WebDriverWait(driver, 5000L);
           wait.until(ExpectedConditions.visibilityOf(element));

       }


       public void switchToNewTabNew (WebElement Element){
           String parentHandle = driver.getWindowHandle();
           int initialCount = driver.getWindowHandles().size();
           Element.click();
           ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
           String currentHandle = null;
           for (int i = 0; i < initialCount + 1; i++) {
               driver.switchTo().window(tabs.get(i));
               currentHandle = driver.getWindowHandle();
               if (!currentHandle.contentEquals(parentHandle))
                   driver.switchTo().window(tabs.get(i));
           }
       }


       public void clicknew (WebElement element)
       {
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].click();", element);
           System.out.println("Element Clicked");

       }
       public void waitForElementToAppear (WebElement element)
       {
           WebDriverWait wait = new WebDriverWait(driver, 20);
           wait.until(ExpectedConditions.visibilityOf(element));

       }

       public void maximizeBrowser ()
       {
           driver.manage().window().maximize();
       }
  /*  public void takeScreenShot()
    {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File();
    }
    }*/

        public void quitDriver()
        {
            driver.quit();
        }

        public static String getTitleofPage()
        {
            return driver.getTitle();
        }

        public static WebDriver getDriver()
        {
            return driver;
        }

        public boolean Elementfound (WebElement element)
        {
            try {
                if (element.isDisplayed()) {
                    System.out.println("Element found!!!!");
                    return true;
                } else {
                    System.out.println("Element not found/not visible");
                    return false;
                }


            } catch (Exception e) {
                // driver.quit(); Commented to fix parallel test cases issue
                System.out.println("Element not found/not visible");
            }
            return false;
        }

        public void findElement (By by){

            driver.findElement(by);
        }

    }


