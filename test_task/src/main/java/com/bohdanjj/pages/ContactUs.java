package com.bohdanjj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs extends BasePage{

    @FindBy(xpath = "//input[contains(@class, 'button-main')]")
    private WebElement buttonAgree;

    @FindBy(xpath = "//input[contains(@class, 'text-field') and @type='text']")
    private WebElement nameField;

    @FindBy(xpath = "//input[contains(@class, 'text-field') and @type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[contains(@class, 'text-field') and contains(@class, 'message')]")
    private WebElement messageField;

    public ContactUs(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ContactUs createAnswer(String name, String email, String message) {
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        messageField.sendKeys(message);
        return this;
    }

    public String getNameFieldValue() {
        return nameField.getAttribute("value");
    }

    public String getEmailFieldValue() {
        return emailField.getAttribute("value");
    }

    public String getMessageFieldValue() {
        return messageField.getAttribute("value");
    }

    public ContactUs clickAgreeButton() {
        buttonAgree.click();
        return this;
    }


}
