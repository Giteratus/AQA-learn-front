package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class FrontTextBoxTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";


    }

    @Test
    void fieldFormTest() {

        open("/automation-practice-form");
        $("#firstName").setValue("Serg");
        $("#lastName").setValue("Veel");
        $("#userEmail").setValue("qa@yyf.ru");
        $("#gender-radio-1").click();
        $("#userNumber").setValue("89994574111");
        $("#dateOfBirthInput").click();
        $("[aria-label*='September 27th, 2026']").click();
        $("#subjectsInput").setValue("e");
        $("#react-select-2-option-0").click();
        $$("#subjectsContainer .subjects-auto-complete__multi-value__label").findBy(exactText("English")).shouldBe(visible);
        $("#subjectsInput").setValue("e");
        $("#react-select-2-option-1").click();
        $$("#subjectsContainer .subjects-auto-complete__multi-value__label").findBy(exactText("Chemistry")).shouldBe(visible);
        $("#hobbies-checkbox-1").click();
        $("#uploadPicture").uploadFromClasspath("snoBord.png");
        $("#uploadPicture").shouldHave(attributeMatching("value", ".*snoBord\\.png$"));
        $("#currentAddress").setValue("Moscow\nMikluha street");
        $(".css-13cymwt-control").click();
        $("#react-select-3-input").click();
        $("#react-select-3-option-1").click();
        $("#state .css-1dimb5e-singleValue").shouldHave(exactText("Uttar Pradesh"));
        $("#react-select-4-input").click();
        $("#react-select-4-option-1").click();
        $("#city .css-1dimb5e-singleValue").shouldHave(exactText("Lucknow"));
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(exactText("Thanks for submitting the form"));
        $$("table.table thead tr").findBy(text("Label")).$("th:nth-child(2)").shouldHave(exactText("Values"));
        $$("table.table tbody tr").findBy(text("Student Name")).$("td:nth-child(2)").shouldHave(exactText("Serg Veel"));
        $$("table.table tbody tr").findBy(text("Student Email")).$("td:nth-child(2)").shouldHave(exactText("qa@yyf.ru"));
        $$("table.table tbody tr").findBy(text("Gender")).$("td:nth-child(2)").shouldHave(exactText("Male"));
        $$("table.table tbody tr").findBy(text("Mobile")).$("td:nth-child(2)").shouldHave(exactText("8999457411"));
        $$("table.table tbody tr").findBy(text("Date of Birth")).$("td:nth-child(2)").shouldHave(exactText("27 September,2026"));
        $$("table.table tbody tr").findBy(text("Subjects")).$("td:nth-child(2)").shouldHave(exactText("English, Chemistry"));
        $$("table.table tbody tr").findBy(text("Hobbies")).$("td:nth-child(2)").shouldHave(exactText("Sports"));
        $$("table.table tbody tr").findBy(text("Picture")).$("td:nth-child(2)").shouldHave(exactText("snoBord.png"));
        $$("table.table tbody tr").findBy(text("Address")).$("td:nth-child(2)").shouldHave(exactText("Moscow Mikluha street"));
        $$("table.table tbody tr").findBy(text("State and City")).$("td:nth-child(2)").shouldHave(exactText("Uttar Pradesh Lucknow"));





    }
}