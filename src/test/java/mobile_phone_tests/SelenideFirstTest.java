package mobile_phone_tests;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideFirstTest {

    @Test
    public void test(){
        open("https://google.com");
    }
}
