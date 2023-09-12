package base_test;

import base.Basepage;
import car_loans.CarLoansPage;
import common.Common_actions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static common.Config.CLEAR_Cookies;
import static common.Config.HOLD_BROWSER_OPEN;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Base_test {
    protected WebDriver driver = Common_actions.createDriver();
    protected  Basepage BasePage = new Basepage(driver);
    protected CarLoansPage CarLoansPage = new CarLoansPage(driver);

    @AfterEach
    void clearCookiesAndLocalStorage(){
        if (CLEAR_Cookies){
            JavascriptExecutor JavascriptExecutor =(JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            JavascriptExecutor.executeScript("window.sessionStorage.clear()");

        }
    }


    @AfterAll
    void close(){
        if (!HOLD_BROWSER_OPEN){
            driver.close();
        }
    }














}
