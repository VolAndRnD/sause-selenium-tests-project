package com.github.VolAndRnD.tests;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseTest {
    private static final String PATH_TO_PROPERTIES = "src/test/resources/application.properties";
    static WebDriver driver;
    static Properties properties = new Properties();
    static String baseUrl;
    static String username;
    static String password;
    static String inventoryUrl;
    static String cartUrl;
    static String checkoutOrderStepOnePageUrl;
    static String checkoutOrderStepTwoPageUrl;

    @BeforeAll
    static void beforAllTests () throws IOException {
        properties.load(new FileInputStream("src/test/resources/application.properties"));
        baseUrl = properties.getProperty("base.url");
        username = properties.getProperty("standard.username");
        password = properties.getProperty("standard.password");
        inventoryUrl = properties.getProperty("inventory.url");
        cartUrl = properties.getProperty("cart.url");
        checkoutOrderStepOnePageUrl = properties.getProperty("checkoutOrderStepOnePage.url");
        checkoutOrderStepTwoPageUrl = properties.getProperty("checkoutOrderStepTwoPage.url");

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();


        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get(baseUrl);
    }

}
