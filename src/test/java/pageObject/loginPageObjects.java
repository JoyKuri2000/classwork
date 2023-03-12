package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPageObjects extends Config {
    public loginPageObjects(WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    //locators
    @FindBy(how = How.NAME, using = "email")
    public WebElement emailLocator;
    public void enterEmail (String email){
        emailLocator.sendKeys(emailAdd);
    }
    @FindBy(how = How.NAME, using = "password")
    public WebElement passwordLocator;
    public void enterPassword (String password){
        passwordLocator.sendKeys(passwordAdd);
    }
    @FindBy(how= How.XPATH, using = "//*[@id='login_form']/input[3]")
    public WebElement loginButtonLocator;
    public void clickOnLoginButton(){
        loginButtonLocator.click();
    }

    public void verifyUserLogSuccessfully(){
        String act = driver.findElement(By.xpath("//*[@id=\"profile_form\"]/legend")).getText();
        String exp = "Welcome to TalentTek";
        Assert.assertEquals(act, exp);
    }

}
