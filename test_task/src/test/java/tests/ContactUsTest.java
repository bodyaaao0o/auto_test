package tests;

import com.bohdanjj.pages.ContactUs;
import com.bohdanjj.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactUsTest extends BaseTest{
    private WebDriver driver;
    private HomePage homePage;
    private ContactUs contactUs;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        contactUs = homePage.openContactForm();
    }

    @Test
    public void testFormSubmission() {
        contactUs.createAnswer("Bohdan", "uhezip78@gmail.com", "Hello from trainee qa");
        assertEquals("Bohdan", contactUs.getNameFieldValue());
        assertEquals("uhezip78@gmail.com", contactUs.getEmailFieldValue());
        assertEquals("Hello from trainee qa", contactUs.getMessageFieldValue());
    }

//    @Test
//    public void testInvalidEmailSubmission() {
//        contactUs.createAnswer("bodya", "blabla.com", "Hello!");
//
//        WebElement emailError = driver.findElement(By.xpath("//input[contains(@class, 'text-field') and @type='email']"));
//
//        assertTrue(emailError.isDisplayed(), "No message Error.");
//
//        assertEquals("Enter a valid email .", emailError.getText());
//    }

    @AfterEach
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }


}
