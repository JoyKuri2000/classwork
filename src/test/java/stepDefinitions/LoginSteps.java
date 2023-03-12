package stepDefinitions;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObject.loginPageObjects;

public class LoginSteps extends Config {
    loginPageObjects lp = new loginPageObjects(driver);
    @Given("user in TalentTek Homepage")
    public void userInTalentTekHomepage() {
        String act = driver.getTitle();
        String exp = "Sign In";
        Assert.assertEquals(act, exp);
    }


//    @And("user enter valid email address")
//    public void userEnterValidEmailAddress() {
//        driver.findElement(By.name("email")).sendKeys(emailAdd);
//    }
    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
        lp.enterEmail(emailAdd);
    }
    @And("user enter valid password")
    public void userEnterValidPassword() {
        lp.enterPassword(passwordAdd);
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        lp.clickOnLoginButton();
    }

    @Then("user should be able to successfully log in")
    public void userShouldBeAbleToSuccessfullyLogIn() {
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/input[3]")).click();
    }
}