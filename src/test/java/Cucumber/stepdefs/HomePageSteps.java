package Cucumber.stepdefs;

import com.testing.frameworkautojava.ManageTest;
import com.testing.frameworkautojava.ReusableFunctions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.DataTableRow;
import org.junit.*;
import com.testing.frameworkautojava.driverfactory;
import com.testing.pageobjects.*;


import java.util.*;

import static org.testng.Assert.assertTrue;


public class HomePageSteps extends ManageTest {



    public HomePageSteps() {

    }

    SigninPage signinpage = new SigninPage(testWebDriver);
    SignUpPage signupPage = new SignUpPage(testWebDriver);
    HomePage homePage = new HomePage(testWebDriver);
    ProfilePage profilePage = new ProfilePage(testWebDriver);

    @Before("@Regression")
    public void before() throws InterruptedException {
        // one-time initialization code
        System.out.println("@BeforeClass - oneTimeSetUp");
        setup();
    }

    @After("@Regression")
    public void after() {
        // one-time initialization code
        System.out.println("@AfterClass - oneTimeSet");

        teardown();
    }


    @Given("^user is on the Sign In Page$")
    public void user_ison_singinpage() {
       // assertTrue(signinpage.validateImage());
        signinpage.signin_icon.click();
    }


    @When("^User Navigate to Sign Up Page$")
    public void navgate_tosignupPage() {
        testWebDriver.waitForElementToAppear(signupPage.signin_button);
        Assert.assertEquals("Ultimate QA", signupPage.getSignUpPagetitle());
        System.out.println("ultimate qa");

    }

    @And("^user enters login details and logins into the portal$")
    public void enterdetails(DataTable givenAttributes) {
        List<DataTableRow> memberAttributesRow = givenAttributes.getGherkinRows();
        System.out.println(memberAttributesRow);
        Map<String, String> memberAttributesMap = new LinkedHashMap<String, String>();
        for (int i = 0; i < memberAttributesRow.size(); i++) {
            memberAttributesMap.put(memberAttributesRow.get(i).getCells()
                    .get(0), memberAttributesRow.get(i).getCells().get(1));
        }
        System.out.println(memberAttributesMap);
        String userName = memberAttributesMap.get("USERNAME");
        String pwd = memberAttributesMap.get("PASSWORD");
        signupPage.login(userName, pwd);
    }

    @Then("^user is successfully able to login into the account$")
    public void verifylogin() {
        Assert.assertTrue( profilePage.getMyDashboardPagetitle().isDisplayed());
    }




}
