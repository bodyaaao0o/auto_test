package tests;

import com.bohdanjj.pages.TechStackPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechStackPageTest {

    private WebDriver driver;
    private TechStackPage techStackPage;

    @BeforeEach
    public void seyUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        techStackPage = new TechStackPage(driver);
    }

    @Test
    public void testTechStakePage() {
        techStackPage.clickFront();
        techStackPage.clickBack();
        techStackPage.clickDataBase();
        techStackPage.clickIntegrations();
        techStackPage.clickMobile();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
