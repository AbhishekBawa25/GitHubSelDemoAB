package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoogleSearchTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set ChromeDriver path (if needed)
        System.setProperty("webdriver.chrome.driver","C:\\Sele\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleSearch() {
        // Open Google
        driver.get("https://www.google.com");

        // Locate search box and enter query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium automation");
        searchBox.submit();

        // Verify title contains search term
        //Assert.assertTrue(driver.getTitle().contains("Selenium automation"), "Title does not contain search term");


    
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
