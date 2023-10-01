package mobile_phone_tests;
import base.Basepage;
import base_test.Base_test;
import mobile_phone.MobilePhoneReplenishmentpage;
import org.junit.Test;

import static constants.Constant.MobileReplanishmentTestData.*;

public class MobilePhoneReplanishmnetTest extends Base_test{
    Basepage basepage = new Basepage(driver); // Создаем объект Basepage
    MobilePhoneReplenishmentpage mobilePhoneReplenishmentpage = new MobilePhoneReplenishmentpage(driver); // Создаем объект MobilePhoneReplenishmentpage

    @Test
    public void CheckRedirecttoAuth() {
        basepage.goToURL("https://next.privat24.ua/mobile");
        mobilePhoneReplenishmentpage.Selectfromcard();
        basepage.isAutoWidgetpresent();
    }
    @Test
    public void Checkallfields(){
        basepage.goToURL("https://next.privat24.ua/mobile");
        basepage.EnterPhonennumber(MOBILE_PAYMENT_PHONENUMBER);
        mobilePhoneReplenishmentpage.EnterExpdate(MOBILE_PAYMENT_EXP);
        mobilePhoneReplenishmentpage.EnterCard(MOBILE_PAYMENT_CARD);
        mobilePhoneReplenishmentpage.EnterCvv(MOBILE_PAYMENT_CVV);




        }





    }

