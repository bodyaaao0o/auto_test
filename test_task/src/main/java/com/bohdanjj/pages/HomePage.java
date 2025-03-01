package com.bohdanjj.pages;

import com.bohdanjj.readProperties.ConfigProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@class=\"w-inline-block w--current\"]")
    private WebElement logo;

    @FindBy(xpath = "//a[@class='link tablet']")
    private WebElement linkedIn;

    @FindBy(xpath = "//a[contains(@class, 'link custom mobile')]")
    private WebElement clutch;

    @FindBy(xpath = "//a[@class='link mobile']")
    private WebElement upWork;

    @FindBy(xpath = "//a[contains(@class,'button-main transperen-bg')]")
    private WebElement buttonContactUs;

    @FindBy(xpath = "//div[@class='navigation-between']")
    private WebElement burger;

    @FindBy(xpath = "//div[@class='navigation-items']//a[@class='navigation-link w-inline-block w--current']")
    private WebElement burgerHome;

    @FindBy(xpath = "(//div[@class='navigation-items']//a[@class='navigation-link w-inline-block'])[1]")
    private WebElement burgerTechStack;

    @FindBy(xpath = "(//div[@class='navigation-items']//a[@class='navigation-link w-inline-block'])[2]")
    private WebElement burgerAboutUs;

    @FindBy(xpath = "(//a[@class='button-main w-button'])[1]")
    private WebElement buttonGetInTouch;

    @FindBy(xpath = "(//a[@class='button-main w-button'])[3]")
    private WebElement buttonLearnMore1;

    @FindBy(xpath = "(//a[@class='button-main w-button'])[4]")
    private WebElement buttonLearnMore2;

    @FindBy(id = "w-dropdown-toggle-0")
    private WebElement edtech;

    @FindBy(id = "w-dropdown-toggle-1")
    private WebElement fintech;

    @FindBy(id = "w-dropdown-toggle-2")
    private WebElement healthcare;

    @FindBy(id = "w-dropdown-toggle-3")
    private WebElement eCommerce;

    @FindBy(xpath = "//img[@class='image-11']")
    private WebElement leftArrow;

    @FindBy(xpath = "//img[@class='image-12']")
    private WebElement rightArrow;


    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://www.code-seek.com/");
        PageFactory.initElements(driver, this);
    }


    public HomePage clickLinkedIn() {
        linkedIn.click();

        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

        return this;
    }

    public HomePage clickClutch() {
        clutch.click();

        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

        return this;
    }

    public HomePage clickUpWork() {
        upWork.click();

        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

        return this;
    }

    public HomePage clickContactUs() {
        buttonContactUs.click();
        return this;
    }

    public HomePage openBurgerMenu() {
        burger.click();
        return this;
    }

    public HomePage navigateToTechStack() {
        burgerTechStack.click();
        return this;
    }

    public HomePage navigateToAboutUs() {
        burgerAboutUs.click();
        return this;
    }


    public HomePage clickLearnMore1() {
        buttonLearnMore1.click();
        return this;
    }

    public HomePage clickLearnMore2() {
        buttonLearnMore2.click();
        return this;
    }

    public HomePage clickEdtech() {
        edtech.click();
        return this;
    }

    public HomePage clickFintech() {
        fintech.click();
        return this;
    }

    public HomePage clickHealthcare() {
        healthcare.click();
        return this;
    }

    public HomePage clickECommerce() {
        eCommerce.click();
        return this;
    }

    public HomePage clickLeftArrow() {
        leftArrow.click();
        return this;
    }

    public HomePage clickRightArrow() {
        rightArrow.click();
        return this;
    }

    public ContactUs openContactForm() {
        buttonContactUs.click();
        return new ContactUs(driver);
    }

    public HomePage goBackToHome() {
        driver.navigate().back();
        return this;
    }
}
