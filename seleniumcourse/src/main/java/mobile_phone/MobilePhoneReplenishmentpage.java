package mobile_phone;

import base.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePhoneReplenishmentpage {
    WebDriver driver;

    public MobilePhoneReplenishmentpage(WebDriver driver) {
        this.driver = driver;
    }

    private final By buttonwallet = new By.ByXPath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[1]/div[4]/div[1]/div[2]/div/div[1]");

    private final By inputcardfrom = new By.ByXPath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[1]/div[4]/div[2]/div/div[1]/div[1]/div[1]/div[2]/input");
    private final By inputexpireddate = new By.ByXPath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/input");
    private final By inputcvv = new By.ByXPath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/input");


    public  MobilePhoneReplenishmentpage Selectfromcard() {
        driver.findElement(buttonwallet).click();
        return this;
    }

    public MobilePhoneReplenishmentpage EnterExpdate(String date) {
        driver.findElement(inputexpireddate).sendKeys(date);
        return this;

    }


    public MobilePhoneReplenishmentpage EnterCard(String card) {
        driver.findElement(inputcardfrom).sendKeys(card);
        return this;

    }

    public MobilePhoneReplenishmentpage EnterCvv(String cvv) {
        driver.findElement(inputcvv).sendKeys(cvv);
        return this;


    }

}
