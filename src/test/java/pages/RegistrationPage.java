package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {


    public void openPage() {
        open("automation-practice-form");
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
