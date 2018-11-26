package com.testing.pageobjects;
import java.lang.*;

import com.testing.frameworkautojava.BasePage;
import com.testing.frameworkautojava.ReusableFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {


    public HomePage(ReusableFunctions driver)
    {    super(driver);
        PageFactory.initElements(ReusableFunctions.getDriver(),this);

    }

        @FindBy(xpath = "//*[@placeholder='Email']")
        WebElement Allcourses_link;

        @FindBy(xpath = "")
        WebElement username_dropdown;

        @FindBy(xpath = "")
        WebElement Mycourses_link;

        public static void click_MyAccount ()
        {

        }


}
