package base;

import common.Common_actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
    public WebDriver driver;
    public Basepage(WebDriver driver) {
        this.driver=driver;



    }

    public  void goToURL(String url){
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
        return element;


    }
}

