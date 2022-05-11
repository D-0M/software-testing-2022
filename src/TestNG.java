import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;
import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG {

    @Test
    public void testMunction() {

        String baseUrl = "https://www.google.com/";

        System.out.println("Launching Google Chrome...");
        driver = new ChromeDriver();
        driver.get(baseUrl);

        String assumedPageTitle = "Google";
        String originalPageTitle = driver.getTitle();
        Assert.assertEquals(originalPageTitle, assumedPageTitle);
    }

    @BeforeMethod
    public void before() {
        System.out.println("Testing on selenium started!");
    }

    @AfterMethod
    public void after() {
        driver.close();
        System.out.println("Testing on selenium finished!");
    }
}