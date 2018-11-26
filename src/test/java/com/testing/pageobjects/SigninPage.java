package com.testing.pageobjects;

import com.testing.frameworkautojava.BasePage;
import com.testing.frameworkautojava.ReusableFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class SigninPage extends BasePage {

   public SigninPage(ReusableFunctions driver)
   {
       super(driver);
       PageFactory.initElements(new AjaxElementLocatorFactory(ReusableFunctions.getDriver(),20),this);

   }

        @FindBy(how = How.XPATH,using="//*[@id=\"wrap\"]/header/div/div[2]/nav/ul[2]/li")
        public WebElement signin_icon=null;


        public String SignInPageTitle ()
        {
           return webdriver.verifyPageTitle();
        }


        public boolean validateImage ()
        {

            return signin_icon.isDisplayed();
        }





}