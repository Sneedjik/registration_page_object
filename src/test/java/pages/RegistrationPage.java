package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {


    public void openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }

    public static SelenideElement firstNameLocator = $("#firstName");
    public static SelenideElement lastNameLocator = $("#lastName");



    public void setFirstName (String value) {
        firstNameLocator.setValue(value);
    }

    public void setLastName (String value) {
        lastNameLocator.setValue(value);
    }

}
