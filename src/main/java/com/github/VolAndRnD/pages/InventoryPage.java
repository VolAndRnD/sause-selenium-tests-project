package com.github.VolAndRnD.pages;


import lombok.Getter;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.openqa.selenium.support.PageFactory.initElements;

public class InventoryPage extends FooterPageElementBase {

    @Getter
    @FindBy(css = "#shopping_cart_container")
    private WebElement cartContainer;
    @FindBy(css = "[data-test='add-to-cart-sauce-labs-bike-light']")
    private WebElement bikeLight;
    @FindBy(css = "[data-test='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement fleeceJacket;
    @FindBy(css = "[class='shopping_cart_link']")
    private WebElement shoppingBascket;
    @Getter
    @FindBy(css = ".shopping_cart_badge")
    private WebElement shoppingCartBadge;

    public InventoryPage(WebDriver driver) {
        super(driver);
        initElements(this.driver, this);
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
