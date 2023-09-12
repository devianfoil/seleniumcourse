package car_loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarLoansPage {
    WebDriver driver;
    public CarLoansPage(WebDriver driver) {
        this.driver = driver;
    }
    public final By tabagreeemnt = new By.ByXPath("//*[@id=\"app\"]/div[2]/section/div[2]/a[2]/div");
    public CarLoansPage selectagreemntsTab(){
        driver.findElement(tabagreeemnt);
        return this;
    }

    public final By newOrdertab = new By.ByXPath("//*[@id=\"app\"]/div[2]/section/div[3]/div[1]/div[3]/div/div/div/div[2]/label[2]");



    public CarLoansPage selectnewcaragremmenttab(){
        driver.findElement(newOrdertab).click();
        return this;

    }


    public final By carpriceinput =  new By.ByXPath("//*[@id=\"app\"]/div[2]/section/div[3]/div[2]/div/div[1]/div/div[1]/div[2]/input");


    public final By prepaymentinput = new By.ByXPath("/html/body/div[1]/div[2]/section/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/input");

    public final By submitanapplicationbutton = new By.ByCssSelector("#app > div.root_wJ9hs8Vo1i > section > div.root_MuWrKTUqNC > div.calculator_ZhOy6N5Xfq > div > div.sc-dAlyuH.cjKwhp > button");




    /// Метод для ввода цены машины
    public final CarLoansPage EnterCarPrice(String numbr){
         WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement carPriceInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(carpriceinput));
        carPriceInputElement.clear();
        carPriceInputElement.sendKeys(numbr);
        return this;

    }

    /// Метод для ввода количества препейммент
    public final CarLoansPage Enterprepaymentinput(String numbr){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement carPriceInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(prepaymentinput));
        carPriceInputElement.clear();
        carPriceInputElement.sendKeys(numbr);
        return this;
    }
    ///Метод для нажатия на кнопку Сабмита аплликации
    public final CarLoansPage Submitanapplication(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement carPriceInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(submitanapplicationbutton));
        carPriceInputElement.clear();
        carPriceInputElement.sendKeys();
        return this;
    }


    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
        return element;

    }
    public final By ErrorWidget = new By.ByXPath("/html/body/div[5]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div");




    public void IsErrorWidgetpresent() {
        WebElement WarningWidget = driver.findElement(ErrorWidget);
        waitElementIsVisible(WarningWidget);


    }







}
