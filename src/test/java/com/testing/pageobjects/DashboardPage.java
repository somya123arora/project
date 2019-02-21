package com.testing.pageobjects;

import com.testing.frameworkautojava.BasePage;
import com.testing.frameworkautojava.ReusableFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {


    public DashboardPage(ReusableFunctions driver)
    {    super(driver);
        PageFactory.initElements(ReusableFunctions.getDriver(),this);

    }


    @FindBy(xpath = "//*[@placeholder='Email']")
    WebElement Dashboardheading;


}

