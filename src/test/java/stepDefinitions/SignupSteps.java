package stepDefinitions;

import base.Config;
import io.cucumber.java.en.And;
import pageObject.signupPageObjects;

public class SignupSteps extends Config {
    signupPageObjects su = new signupPageObjects(driver);
    @And("user enters first and last name")
    public void userEntersFirstAndLastName() {
        su.enterFirstName();
        su.enterLastName();
    }

    @And("user enters valid email address")
    public void userEntersValidEmailAddress() {
        su.enterEmail();
    }

    @And("user enters month under birthdate")
    public void userEntersMonthUnderBirthdate() {
        su.dropDownMonth("Nov");
    }
}
