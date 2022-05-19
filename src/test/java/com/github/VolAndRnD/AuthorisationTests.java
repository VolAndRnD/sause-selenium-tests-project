package com.github.VolAndRnD;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;


class AuthorisationTests {
    static WebDriver  driver;

    @BeforeAll
    static void beforAll () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
    }


    @Test
    void authorisationPositivTest() throws InterruptedException {
        //1.1.Авторизация
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test='login-button']")).click();
        assertThat(driver.getCurrentUrl(),equalTo("https://www.saucedemo.com/inventory.html"));
        assertThat(driver.findElements(By.cssSelector("#shopping_cart_container")).size(), not(equalTo(0)));
        // 1.2. Выбор товара
        driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-bike-light']")).click();
        driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-fleece-jacket']")).click();
        driver.findElement(By.cssSelector("[class='shopping_cart_link']")).click();
        // 1.3. Ввод данных
        driver.findElement(By.cssSelector("[data-test='checkout']")).click();
        driver.findElement(By.cssSelector("[data-test='firstName']")).click();
        driver.findElement(By.cssSelector("[data-test='firstName']")).sendKeys("Andrew");
        driver.findElement(By.cssSelector("[data-test='lastName']")).click();
        driver.findElement(By.cssSelector("[data-test='lastName']")).sendKeys("Volkov");
        driver.findElement(By.cssSelector("[data-test='postalCode']")).click();
        driver.findElement(By.cssSelector("[data-test='postalCode']")).sendKeys("1234");
        // 2.1.(необязательное задание) Боковое меню
        assertThat(driver.findElements(By.cssSelector("#react-burger-menu-btn")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("#inventory_sidebar_link")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("#about_sidebar_link")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("#logout_sidebar_link")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("#reset_sidebar_link")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("#react-burger-cross-btn")).size(), not(equalTo(0)));
        //2.2 Header
        assertThat(driver.findElements(By.cssSelector("[class='app_logo']")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("[class='shopping_cart_link']")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("[class='title']")).size(), not(equalTo(0)));
        //2.3 Центральные поля для ввода данных
        assertThat(driver.findElements(By.cssSelector("[data-test='firstName']")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("[data-test='lastName']")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("[data-test='postalCode']")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("[data-test='cancel']")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("[data-test='continue']")).size(), not(equalTo(0)));
        //2.4. Подвал(чтобы это не означало, оно должно называться именно так)
        assertThat(driver.findElements(By.cssSelector("[class='social_twitter']")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("[class='social_facebook']")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("[class='social_linkedin']")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("[class='footer_copy']")).size(), not(equalTo(0)));
        assertThat(driver.findElements(By.cssSelector("[class='footer_robot']")).size(), not(equalTo(0)));




        //1.4. Оформление заказа
        driver.findElement(By.cssSelector("[data-test='continue']")).click();
        driver.findElement(By.cssSelector("[data-test='finish']")).click();



    }

    @AfterAll
    static void afterAll(){
        driver.quit();
    }

}
