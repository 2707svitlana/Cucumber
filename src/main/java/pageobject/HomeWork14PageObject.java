package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeWork14PageObject {


    @FindBy(xpath = "//input[@name=\"certificate\"]")
    WebElement certificateCheckField;
    @FindBy(xpath = "//p[@class=\"certificate-check_message\"]")
    WebElement message;
    public void sendKeysToCheckForm(String str) {
        certificateCheckField.sendKeys(str);
        certificateCheckField.sendKeys(Keys.ENTER);
    }
    public String getMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return message.getText();
    }
    }


