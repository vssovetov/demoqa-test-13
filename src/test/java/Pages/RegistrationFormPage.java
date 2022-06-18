package Pages;

import Pages.Components.DatePicker;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFormPage {
    DatePicker datePicker = new DatePicker();

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        $("#firstName").setValue(value);
        return this;
    }

    public RegistrationFormPage setLastName(String value) {
        $("#lastName").setValue(value);
        return this;
    }

    public RegistrationFormPage setEmail(String value) {
        $("#userEmail").setValue(value);
        return this;
    }

    public RegistrationFormPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage setPhoneNumber(String value) {
        $("#userNumber").setValue(value);
        return this;
    }

    public RegistrationFormPage enterKeySubject() {
        $(byId("subjectsInput")).sendKeys("P");
        $(byText("Physics")).click();
        $(byId("subjectsInput")).sendKeys("Commerce");
        $(byId("subjectsInput")).pressEnter();
        return this;
    }

    public RegistrationFormPage setDateOfBirth(String day, String month, String year) {
        $(byId("dateOfBirthInput")).click();
        datePicker.setDate(day, month, year);
        return this;
    }

    public RegistrationFormPage setCheckBoxes() {
        $(".custom-checkbox:nth-child(1) > .custom-control-label").click();
        $(".custom-checkbox:nth-child(2) > .custom-control-label").click();
        return this;
    }

    public RegistrationFormPage uploadFile(String value) {
        $(byId("uploadPicture")).uploadFromClasspath(value);
        return this;
    }

    public RegistrationFormPage setCurentAdress(String value) {
        $(byId("currentAddress")).sendKeys("curent address");
        return this;
    }
    public RegistrationFormPage setStateAndCity() {
        $(byId("state")).scrollTo().click();
        $(byText("NCR")).click();
        $(byId("city")).click();
        $(byId("stateCity-wrapper")).$(byText("Delhi")).click();
        $(byId("submit")).click();
        return this;
    }
    public RegistrationFormPage chekResaults(String key,String value){
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText(key))
                 .parent().shouldHave(Condition.text(value));
        return this;
    }
}
