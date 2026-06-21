package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumSmokeTest {

    @Test
    public void shouldOpenGooglePage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "--headless=new",
                "--no-sandbox",
                "--disable-dev-shm-usage",
                "--window-size=1920,1080"
        );

        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get("https://www.google.com");
            Assert.assertTrue(driver.getCurrentUrl().contains("google"));
            Assert.assertTrue(driver.getTitle().length() > 0);
        } finally {
            driver.quit();
        }
    }
}
