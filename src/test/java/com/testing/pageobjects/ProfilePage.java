package com.testing.pageobjects;


import com.testing.frameworkautojava.BasePage;
import com.testing.frameworkautojava.ReusableFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BasePage {

    public ProfilePage(ReusableFunctions driver)
    {
        super(driver);


        PageFactory.initElements(ReusableFunctions.getDriver(),this);

    }
    @FindBy(className ="student-dashboard__title")
    WebElement mydashboardheading;


    public WebElement getMyDashboardPagetitle()
    {
        return mydashboardheading;
    }


    public String getProfilePagetitle()
    {
        return webdriver.verifyPageTitle();
    }
}
