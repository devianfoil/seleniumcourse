package mobile_phone;

import base.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePhoneReplenishmentpage  extends Basepage {

    public MobilePhoneReplenishmentpage(WebDriver driver) {
        super(driver);
    }
    private final By buttonwallet = new By.ByXPath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[1]/div[4]/div[1]/div[2]/div/div[1]");


    public MobilePhoneReplenishmentpage SelectFromwallet(){
        driver.findElement(buttonwallet).click();
        return this;
    }
}
