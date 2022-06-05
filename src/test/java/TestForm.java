import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
    public class TestForm extends TestBase{


        @Test
        void successfulTest() {
                String name = "Alex";
                String fileName = "att.png";
                open("/automation-practice-form");
                executeJavaScript("$('footer').remove()");
                executeJavaScript("$('#fixedban').remove()");
//general info
                $("[id=firstName]").setValue(name);
                $("[id=lastName]").setValue("sovetsky");
                $("[id=userEmail]").setValue("alex@egorov.com");
                $("[for=gender-radio-3]").click();
                $("[id=userNumber]").setValue("9889889888");
//datepicker

                $(byId("dateOfBirthInput")).click();
                $(byCssSelector(".react-datepicker__year-select")).selectOptionByValue("1992");
                $(byCssSelector(".react-datepicker__month-select")).selectOption("October");
                $(byCssSelector(".react-datepicker__day--029")).click();

//subject
                $(byId("subjectsInput")).sendKeys("P");
                $(byText("Physics")).click();
                $(byId("subjectsInput")).sendKeys("Commerce");
                $(byId("subjectsInput")).pressEnter();
// checbox

                $(".custom-checkbox:nth-child(1) > .custom-control-label").click();
                $(".custom-checkbox:nth-child(2) > .custom-control-label").click();
// upload
                $(byId("uploadPicture")).uploadFromClasspath(fileName);

//curent address
                $(byId("currentAddress")).sendKeys("curent address");
//state and city
                $(byId("state")).scrollTo().click();
                $(byText("NCR")).click();
                $(byId("city")).click();
                $(byId("stateCity-wrapper")).$(byText("Delhi")).click();
                $(byId("submit")).click();

            }
        }


