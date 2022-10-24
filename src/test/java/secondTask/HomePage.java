package secondTask;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private final SelenideElement photo = $(byName("photo"));
}
