package car_loans_tests;

import base.Basepage;
import base_test.Base_test;
import car_loans.CarLoansPage;
import mobile_phone.MobilePhoneReplenishmentpage;
import org.junit.Test;

import static constants.Constant.CarLoansTestData.CAR_PRICE;
import static constants.Constant.CarLoansTestData.YOUR_PREPAYMENT;
import static constants.Constant.MobileReplanishmentTestData.MOBILE_PAYMENT_PHONENUMBER;

public class CarLoansTest extends Base_test {
    CarLoansPage carLoansPage = new CarLoansPage(driver);
    Basepage basepage = new Basepage(driver);

    @Test
    public void SelectagreementtabinPublicsessio(){
        basepage.goToURL("https://next.privat24.ua/auto-credit/order");
        carLoansPage.selectagreemntsTab();
        basepage.isAutoWidgetpresent();
    }


    @Test
    public void Technicalerrorpoupappearing(){
        basepage.goToURL("https://next.privat24.ua/auto-credit/order");
        carLoansPage.selectnewcaragremmenttab();
        carLoansPage.EnterCarPrice(CAR_PRICE);
        carLoansPage.Enterprepaymentinput(YOUR_PREPAYMENT);
        basepage.EnterPhonennumber(MOBILE_PAYMENT_PHONENUMBER);

        carLoansPage.Submitanapplication();
        carLoansPage.IsErrorWidgetpresent();
    }
}
