package com.github.VolAndRnD.pages;


import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.not;

public class InventoryPage extends BasePage  {
    @FindBy(css = "#shopping_cart_container")
    private WebElement cartContainer;
    @FindBy(css = "[data-test='add-to-cart-sauce-labs-bike-light']")
    private WebElement bikeLight;
    @FindBy(css = "[data-test='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement fleeceJacket;
    @FindBy(css = "[class='shopping_cart_link']")
    private WebElement shoppingBascket;


    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public InventoryPage checkInventoryPageUrl(String inventoryUrl) {
        assertThat(driver.getCurrentUrl(), equalTo(inventoryUrl));
        return this;
    }
    public InventoryPage checkCartOnThePage() {
        assertThat(cartContainer.getSize(), not(Matchers.equalTo(0)));
        return this;
    }
    public InventoryPage choiceClothes1(){
        bikeLight.click();
        return this;
    }
    public InventoryPage choiceClothes2(){
        fleeceJacket.click();
        return this;
    }
    public CartPage enterShoppingBascket(){
        shoppingBascket.click();
        return new CartPage(driver);
    }







}

