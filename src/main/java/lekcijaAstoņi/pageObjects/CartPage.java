package lekcijaAstoņi.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    private By checkoutButton = By.id("checkout");
    private By pageTitle = By.className("title");

    public CartPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getCheckoutButton() {
        return driver.findElement(checkoutButton);
    }


    public WebElement getCheckOutButton() {
        return driver.findElement(checkoutButton);
    }
}
