package tests;

import org.junit.jupiter.api.Test;

public class TestFormWithPageObject extends TestBase {


    String firstName = "Alex";
    String lastName = "sovesky";
    String Email = "123@mail.com";
    String fileName = "att.png";
    String phoneNumber = "89889889888";
    String gender = "Other";
    String day = "29";
    String month = "October";
    String year = "1992";
    String currentAdress = "Current adress with PO";
    String expendetDate = "29 October,1992";
//Как записать дату с , в переменную??
    @Test
    void successfulTest() {
//open page
        registrationFormPage.openPage()
//general info
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(Email)
                .setGender(gender)
                .setPhoneNumber(phoneNumber)
//datepicker
                .setDateOfBirth(day, month, year)
//subject
                .enterKeySubject()
// checbox
                .setCheckBoxes()
// upload
                .uploadFile(fileName)
//curent address
                .setCurentAdress(currentAdress)
//state and city
        .setStateAndCity()
            .chekResaults("Date of Birth",expendetDate);
    }
}


