package lekcijaAstoņi.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class ProductsPage extends BasePage{


    WebDriverWait wait;

    private By pageTitle = By.cssSelector("span.title");
    private By cartButton = By.id("shopping_cart_container");
    private By addToCartButton = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By removeButton = By.id("remove-sauce-labs-bolt-t-shirt");

    private By tShirt = By.className("inventory_item_name");
    public ProductsPage(WebDriver driver) {
        super (driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement getCartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(cartButton));
        return driver.findElement(cartButton);
    }

    public WebElement getPageTitle(){
        return driver.findElement(pageTitle);
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(addToCartButton);
    }

    public AbstractButton getRemoveButton() {
        return (AbstractButton) driver.findElement(removeButton);


    }
    public WebElement getTShirt(){

        return driver.findElement(tShirt);
    }
}



