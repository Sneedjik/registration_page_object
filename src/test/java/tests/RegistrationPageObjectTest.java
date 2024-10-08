package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPageObjectTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName("Bony")
                .setLastName("Skye")
                .setEmail("Bony@test.com")
                .setGender("Male")
                .setUserNumber("9659112131")
                .setDateOfBirth("007", "October", "1991")
                .setSubject("Maths")
                .setHobbie("Reading")
                .setPicture("One-Punch Man.jpg")
                .setAddress("Street 1")
                .setState("NCR")
                .setCity("Delhi")
                .submit()

                .checkResult("Student Name", "Bony Skye")
                .checkResult("Student Email", "Bony@test.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "9659112131")
                .checkResult("Date of Birth", "07 October,1991")
                .checkResult("Subjects", "Maths")
                .checkResult("Hobbies", "Reading")
                .checkResult("Picture", "One-Punch Man.jpg")
                .checkResult("Address", "Street 1")
                .checkResult("State and City", "NCR Delhi");
    }

}
