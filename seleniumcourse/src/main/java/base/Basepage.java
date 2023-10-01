package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
    public WebDriver driver;
    public Basepage(WebDriver driver) {
        this.driver=driver;



    }
    public final By AutoWidget = By.xpath("//*[@id=\"app\"]/div/div");

    public  void goToURL(String url){
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
        return element;




    }
     public void isAutoWidgetpresent(){
        WebElement AutoFrame = driver.findElement(AutoWidget);
        waitElementIsVisible(AutoFrame);

    }

    public final By ErrorWidget = new By.ByXPath("/html/body/div[5]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div");
    private final By inputphonenumber = new  By.ByXPath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[1]/div[1]/div/div/div[2]/div[3]/div[1]/input");


    public Basepage EnterPhonennumber(String number){
        driver.findElement(inputphonenumber).sendKeys(number);
        return this;

    }





    public void IsErrorWidgetpresent(){
        WebElement WarningWidget = driver.findElement(ErrorWidget);
        waitElementIsVisible(WarningWidget);
    }
}


