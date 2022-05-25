package com.github.VolAndRnD.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckoutOrderStepOne extends BasePage{

    @FindBy(css = "[data-test='firstName']")
    private WebElement orderFirstName;
    @FindBy(css = "[data-test='lastName']")
    private WebElement orderLastName;
    @FindBy( css = "[data-test='postalCode']")
    private WebElement orderPostalCode;
    @FindBy(css = "[data-test='continue']")
    private WebElement buttonContinue;
    @FindBy(css = "#react-burger-menu-btn")
    private WebElement sidebar;
    @FindBy(css = "#inventory_sidebar_link")
    private WebElement sidebarInventory;
    @FindBy(css = "#about_sidebar_link")
    private WebElement sidebarAbout;
    @FindBy(css = "#logout_sidebar_link")
    private WebElement sidebarLogout;
    @FindBy(css = "#reset_sidebar_link")
    private WebElement sidebarReset;
    @FindBy(css = "#react-burger-cross-btn")
    private WebElement sidebarExit;
    @FindBy(css = "[class='app_logo']")
    private WebElement headerLogo;
    @FindBy(css = "[class='shopping_cart_link']")
    private WebElement shoppingCartLink;
    @FindBy(css = "[class='title']")
    private WebElement title;
    @FindBy(css = "[data-test='cancel']")
    private WebElement buttonCancel;
    @FindBy(css = "[class='social_twitter']")
    private WebElement linkTwitter;
    @FindBy(css = "[class='social_facebook']")
    private WebElement linkFacebook;
    @FindBy(css = "[class='social_linkedin']")
    private WebElement linkLinkedin;
    @FindBy(css = "[class='footer_copy']")
    private WebElement footerCopy;
    @FindBy(css = "[class='footer_robot']")
    private WebElement footerRobot;

    public CheckoutOrderStepOne(WebDriver driver) {
        super(driver);
    }

    public CheckoutOrderStepOne checkCheckoutOrderStepOnePageUrl(String CheckoutOrderStepOnePageUrl) {
        assertThat(driver.getCurrentUrl(), equalTo(CheckoutOrderStepOnePageUrl));
        return this;
    }

    public CheckoutOrderStepOne inputFirstName (String firstname) {
        orderFirstName.click();
        orderFirstName.sendKeys(firstname);
        return this;
    }

    public CheckoutOrderStepOne inputLastName (String lastname) {
        orderLastName.click();
        orderLastName.sendKeys(lastname);
        return this;
    }

    public CheckoutOrderStepOne inputPostalCode (String code) {
        orderPostalCode.click();
        orderPostalCode.sendKeys(code);
        return this;
    }
    public CheckoutOrderStepOne findSidebar () {
        assertThat(sidebar.getSize(), not(equalTo(0)));
        return this;
    }

    public CheckoutOrderStepOne findSidebarInventory () {
        assertThat(sidebarInventory.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findSidebarAbout () {
        assertThat(sidebarAbout.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findSidebarLogout () {
        assertThat(sidebarLogout.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findSidebarReset () {
        assertThat(sidebarReset.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findSidebarExit () {
        assertThat(sidebarExit.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findHeaderLogo () {
        assertThat(headerLogo.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findShoppingCartLink () {
        assertThat(shoppingCartLink.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findTittle () {
        assertThat(title.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findFirstName () {
        assertThat(orderFirstName.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findLastName () {
        assertThat(orderLastName.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findPostalCode () {
        assertThat(orderPostalCode.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findButtonCancel () {
        assertThat(buttonCancel.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findButtonContinue () {
        assertThat(buttonContinue.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findLinkTwitter () {
        assertThat(linkTwitter.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findLinkFacebook () {
        assertThat(linkFacebook.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findLinkLinkedin () {
        assertThat(linkLinkedin.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findFooterCopy () {
        assertThat(footerCopy.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepOne findFooterRobot () {
        assertThat(footerRobot.getSize(), not(equalTo(0)));
        return this;
    }
    public CheckoutOrderStepTwo clickContinue () {
        buttonContinue.click();
        return new CheckoutOrderStepTwo(driver);
    }
}
