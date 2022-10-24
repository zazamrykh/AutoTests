package firstTask;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.*;
import static  com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class OKTest {
    @Test
    void shouldOpen() {
        open("https://ok.ru/");

        $(byName("st.email")).setValue("2281337");
        $(byName("st.password")).setValue("2281337");

        $(byAttribute("data-l", "t,sign_in")).click();
        $(byText("����������� ������ ����� �/��� ������")).should(exist);
//        assertTrue($(byText("����������� ������ ����� �/��� ������")).exists());
    }
}
