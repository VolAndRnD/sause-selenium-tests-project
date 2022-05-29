package com.github.VolAndRnD.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;

import static com.github.VolAndRnD.utils.ScreenshotMaker.makeScreenshotOnFailure;


public abstract class BaseTest {
    private static final String PATH_TO_PROPERTIES = "src/test/resources/application.properties";
    public static WebDriver driver;

    public static Properties properties = new Properties();
    public static String baseUrl;
    public static String username;
    public static String password;
    public static String inventoryUrl;
    public static String cartUrl;
    public static String checkoutOrderStepOnePageUrl;
    public static String checkoutOrderStepTwoPageUrl;
    public static String troubleUsername1;
    public static String troubleUsername2;
    public static String troubleUsername3;
    public static String checkoutComplete;


     @BeforeEach
     void beforeEachTests() throws IOException {
        driver =  WebDriverManager.chromedriver().create();

        properties.load(new FileInputStream("src/test/resources/application.properties"));
        baseUrl = properties.getProperty("base.url");
        username = properties.getProperty("standard.username");
        password = properties.getProperty("standard.password");
        inventoryUrl = properties.getProperty("inventory.url");
        cartUrl = properties.getProperty("cart.url");
        checkoutOrderStepOnePageUrl = properties.getProperty("checkoutOrderStepOnePage.url");
        checkoutOrderStepTwoPageUrl = properties.getProperty("checkoutOrderStepTwoPage.url");
        troubleUsername1 = properties.getProperty("non-standard1.username");
        troubleUsername2 = properties.getProperty("non-standard2.username");
        troubleUsername3 = properties.getProperty("non-standard3.username");
        checkoutComplete = properties.getProperty("checkoutComplete.url");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get(baseUrl);
    }

    @AfterEach
    void afterEach() throws IOException {
        Allure.addAttachment("Page screenshot", new FileInputStream(makeScreenshotOnFailure(driver)));
        driver.manage()
                .logs()
                .get(LogType.BROWSER)
                .getAll()
                .forEach(System.out::println);
    }



    @AfterAll
    static void afterAll(){
        if (driver!= null){
            driver.quit();}
        }
    }


