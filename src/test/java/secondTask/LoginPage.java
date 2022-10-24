package secondTask;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement loginBar = $(byName("st.email"));
    private final SelenideElement passwordBar = $(byName("st.password"));
    private final SelenideElement enterButton = $(byAttribute("data-l", "t,sign_in"));

    public void setLoginBar (String login) {
        loginBar.setValue(login);
    }

    public void setPasswordBar (String password) {
        passwordBar.setValue(password);
    }

    public void clickEnterButton (){
        enterButton.click();
    }

}
