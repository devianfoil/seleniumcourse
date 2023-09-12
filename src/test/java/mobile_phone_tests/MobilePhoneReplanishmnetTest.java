package mobile_phone_tests;
import base_test.Base_test;
import mobile_phone.MobilePhoneReplenishmentpage;
import org.junit.Test;

public class MobilePhoneReplanishmnetTest extends Base_test{

    @Test
    public void CheckRedirecttoAuth(){
        BasePage.goToURL("https://next.privat24.ua/mobile");
        MobilePhoneReplenishmentpage.SelectFromwallet();





    }
}
