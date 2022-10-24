package secondTask;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainTest {

    @Test
    public void shouldBeLogin() {
        LoginPage loginPage = new LoginPage();
        open(Config.SITE_URL);
        loginPage.setLoginBar(Config.USER_LOGIN);
        loginPage.setPasswordBar(Config.USER_PASSWORD);
        loginPage.clickEnterButton();
        $(byName("photo")).should(exist);
    }

    @Test
    public void shouldNotBeLoginCauseWrongInputData() {
        LoginPage loginPage = new LoginPage();
        open(Config.SITE_URL);
        loginPage.setLoginBar("Some_incorrect_login");
        loginPage.setPasswordBar("Some_incorrect_password");
        loginPage.clickEnterButton();
        // Думаю, что метод проверки правильности теста должен быть тут.
        $(byXpath("//div[@class='form_i form_i__error']")).should(exist);
    }
}
