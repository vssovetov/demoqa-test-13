package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class TestFormWithFaker extends TestBase{

    Faker faker = new Faker();
    String firstName = faker.address().firstName();
    String lastName = faker.address().lastName();
    String Email = faker.internet().emailAddress();
    String fileName = "att.png";
    String phoneNumber = faker.phoneNumber().subscriberNumber(10);
    String gender = "Other";
    String day = "29";
    String month = "October";
    String year = "1992";
    String currentAdress = faker.address().fullAddress();
    //assertion
    String expendetDate = "29 October,1992";
    String studentName = firstName+" "+lastName;
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
                .chekResaults("Date of Birth",expendetDate)
                .checkFirstSecondName("Student Name",studentName);
    }
}

