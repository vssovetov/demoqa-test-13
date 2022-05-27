
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

    public class testForm {

        @BeforeAll
        static void beforeAll() {
            Configuration.baseUrl = "https://demoqa.com";
            Configuration.browserSize = "1920x1080";
        }

        @Test
        void successfulTest() {
            String name = "Alex";

            open("/automation-practice-form");
            executeJavaScript("$('footer').remove()");
            executeJavaScript("$('#fixedban').remove()");

            $("[id=firstName]").setValue(name);
            $("[id=lastName]").setValue("sovetsky");
            $("[id=userEmail]").setValue("alex@egorov.com");
            $("[class=custom-control-label]").click();
            $("[id=userNumber]").setValue("9889889888");
            $("[id=dateOfBirthInput]").setValue("29.10.1992");

            $("[id=output]").shouldHave(text(name), text("alex@egorov.com"),
                    text("Some address 1"), text("Another address 2"));
        }
    }


    //id="firstName
//id="lastName"
//id="userEmail"
//id="gender-radio-3"
//id="userNumber"
//id="dateOfBirthInput"
// //*[@id="subjectsContainer"]/div/div[1]??????
//id="hobbies-checkbox-3"
//id="currentAddress"
//
//
//
//
