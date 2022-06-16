package Pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormPage {
    public void setFirstName(String value){
        $("#firstName").setValue(value);
    }
    public void setLastName(String value){
        $("#lastName").setValue(value);
    }
    public void setEmail(String value){
        $("#userEmail").setValue(value);
    }
    public void setGender (String value){
        $("#genterWrapper").$(byText("Other")).click();
    }
}
