package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumSmokeTest {

    @Test
    public void seleniumClassesAreAvailable() throws Exception {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        driver.quit();

    }
}
