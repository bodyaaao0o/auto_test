package tests;

import com.bohdanjj.pages.HomePage;
import com.bohdanjj.readProperties.ConfigProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest {
    private WebDriver driver;
    private HomePage homePage;

    public void waitForUrlToContain(String expectedPart) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Чекаємо до 5 секунд
        wait.until(ExpectedConditions.urlContains(expectedPart));
    }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Test
    public void testNavigationLinks() {
        homePage.clickLinkedIn();
        waitForUrlToContain("linkedin.com");
        assertTrue(driver.getCurrentUrl().contains("linkedin.com"));
        driver.close(); // Закриваємо нову вкладку
        driver.switchTo().window(driver.getWindowHandles().iterator().next()); // Повертаємось у перше вікно

        homePage.clickClutch();
        waitForUrlToContain("clutch.co");
        assertTrue(driver.getCurrentUrl().contains("clutch.co"));
        driver.close();
        driver.switchTo().window(driver.getWindowHandles().iterator().next());

        homePage.clickUpWork();
        waitForUrlToContain("upwork.com");
        assertTrue(driver.getCurrentUrl().contains("upwork.com"));
        driver.close();
        driver.switchTo().window(driver.getWindowHandles().iterator().next());
    }


    @Test
    public void testBurgerMenuNavigation() {
        homePage.openBurgerMenu();
        homePage.navigateToTechStack();
        assertTrue(driver.getCurrentUrl().contains("tech-expertise"));
        homePage.goBackToHome();

        homePage.openBurgerMenu();
        homePage.navigateToAboutUs();
        assertTrue(driver.getCurrentUrl().contains("about-us"));
        homePage.goBackToHome();
    }

    @Test
    public void testContactUsButton() {
        homePage.clickContactUs();
    }

    @Test
    public void testLearnMore1() {
        homePage.clickLearnMore1();
    }

    @Test
    public void testToggles() {
        homePage.clickEdtech();
        homePage.clickFintech();
        homePage.clickHealthcare();
        homePage.clickECommerce();
    }

    @Test
    public void testLearnMore2() {
        homePage.clickLearnMore2();
    }

    @Test
    public void testArrows() {
        homePage.clickLeftArrow();
        homePage.clickRightArrow();
    }



    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
