package stepDefinitions;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

public class Hook extends Config {
    //QA: http://www.qa.taltektc.com
    //STAGE: http://www.stage.taltektc.com
    //PROD: http://www.prod.taltektc.com

    public static String url;
    public static String driverType = System.getProperty("browser");
    public static String envType = System.getProperty("env");

    @Before
    public void beforeEachTest(){
//        System.setProperty("webdriver.http.factory", "jdk-http-client");
        if(Strings.isNullOrEmpty(driverType)){
            driverType="ch";
        }
        if(Strings.isNullOrEmpty(envType)){
            envType="qa";
        }
//        if(driverType==null){
//            driverType="ch";
//        }else {
//            driver = setupBrowser(driverType);
//        }
//        if(envType==null){
//            envType="qa";}
//        }else {
//            driver = setupBrowser(driverType);
//        }
        driver = setupBrowser(driverType);
        switch(envType) {
            case "qa":
                url = "http://www.qa.taltektc.com";
                emailAdd = "Jkuri2000@gmail.com";
                passwordAdd = "Kurijoy0002";
                break;
            case "stg":
                url = "http://www.stage.taltektc.com";
                break;
            case "prod":
                url = "http://www.prod.taltektc.com";
                break;
            default:
                url = "http://www.qa.taltektc.com";
        }
        driver.get(url);
    }

    @After
    public void afterEachTest(Scenario scenario){
        try{
            if(scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
    }finally {
            driver.quit();
        }
    }

}
