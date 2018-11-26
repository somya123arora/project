package Cucumber;
import org.junit.runner.*;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
 @CucumberOptions(
         features ="src/test/java/Cucumber/features/login.feature"
         ,glue="Cucumber.stepdefs",format = {"pretty","json:target/cucumber.json"}, tags = { "@Regression"}


 )

 public class CucumberRunner extends AbstractTestNGCucumberTests{

 }





