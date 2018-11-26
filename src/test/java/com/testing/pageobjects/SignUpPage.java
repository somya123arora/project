package com.testing.pageobjects;


import java.io.IOException;
import java.lang.*;

import com.testing.frameworkautojava.BasePage;
import com.testing.frameworkautojava.ReusableFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage extends BasePage {




        @FindBy(xpath = "//*[@placeholder='Email']")
        public static WebElement email;

        @FindBy(xpath ="//*[@placeholder='Password']")
        public static WebElement password;

        @FindBy(xpath = "//*[@id='btn-signin']")
        public static WebElement signin_button;


        @FindBy(name = "//*[@id='btn-signin']")
        public static WebElement forgot_passwordlink;


        @FindBy(name = "//*[@id='btn-signin']")
       public static WebElement CreateAccountLink;


  public String getSignUpPagetitle()
  {
      return webdriver.verifyPageTitle();
  }


    public void  login(String uname, String pword)
    {
       email.sendKeys(uname);
       password.sendKeys(pword);
       signin_button.click();
    }


    public SignUpPage(ReusableFunctions driver) {

       super(driver);
       PageFactory.initElements(ReusableFunctions.getDriver(),this);

    }





}
