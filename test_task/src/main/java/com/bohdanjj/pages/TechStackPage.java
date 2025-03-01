package com.bohdanjj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechStackPage extends BasePage{

    @FindBy(xpath = "//a[@class=\"tab w-inline-block w-tab-link w--current\"]")
    private WebElement front;

    @FindBy(xpath = "//a[@class=\"tab w-inline-block w-tab-link\"][1]")
    private WebElement back;

    @FindBy(xpath = "//a[@class=\"tab w-inline-block w-tab-link\"][2]")
    private WebElement dataBase;

    @FindBy(xpath = "//a[@class=\"tab w-inline-block w-tab-link\"][3]")
    private WebElement integrations;

    @FindBy(xpath = "//a[@class=\"tab w-inline-block w-tab-link\"][4]")
    private WebElement mobile;


    public TechStackPage(WebDriver driver) {
        super(driver);
        driver.get("https://www.code-seek.com/tech-expertise");
        PageFactory.initElements(driver, this);
    }

    public TechStackPage clickFront() {
        front.click();
        return this;
    }

    public TechStackPage clickBack() {
        back.click();
        return this;
    }

    public TechStackPage clickDataBase() {
        dataBase.click();
        return this;
    }

    public TechStackPage clickIntegrations() {
        integrations.click();
        return this;
    }

    public TechStackPage clickMobile() {
        mobile.click();
        return this;
    }
}
