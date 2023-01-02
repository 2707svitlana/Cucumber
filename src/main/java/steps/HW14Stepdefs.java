package steps;

import configuration.BaseClass;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageobject.HomeWork14PageObject;
public class HW14Stepdefs extends BaseClass {
    static HomeWork14PageObject homeWork14PageObject = PageFactory.initElements(driver,HomeWork14PageObject.class);
        @When("Open page {string}")
        public void openPage(String url) {
            driver.get(url);
        }
        @Given("Enter number {string} in check field")
        public void enterNumberInSearchField(String number) {
            homeWork14PageObject.sendKeysToCheckForm(number);
        }
        @Then("Check that message is displayed")
        public void checkThatMessageIsDisplayed() {
            System.out.println(homeWork14PageObject.getMessage());
            Assert.assertEquals("Сертифікат не знайдено",homeWork14PageObject.getMessage());
        }
    }

