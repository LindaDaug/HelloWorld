package lekcijaAstoņiTest;

import lekcijaAstoņi.pageObjects.*;
import lekcijaSeptiniTest.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarijsViens<CheckOutPage> extends BaseTest {

    @Test


    public void testShopping() throws InterruptedException {
        System.out.println("navigēt uz saiti http://www.saucedemo.com/");
        System.out.println("Ielogoties ar pareizi lietotajvardu un paroli");
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage produktuLapa = new ProductsPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(produktuLapa.getPageTitle().getText(),"PRODUCTS");

        System.out.println("ievietot grozā produktu");
        produktuLapa.getAddToCartButton().click();
        Assert.assertEquals(produktuLapa.getRemoveButton().getText(),"REMOVE");
        produktuLapa.getCartButton().click();
        CartPage grozaLapa = new CartPage(driver);
        Assert.assertEquals(grozaLapa.getPageTitle().getText(), "YOUR CART");

        System.out.println("Doties uz checkout");
        grozaLapa.getCheckOutButton().click();

        CheckoutPage checkoutLapa = new CheckoutPage(driver);
        Assert.assertEquals(checkoutLapa.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutLapa.clickContinueButton();

        Assert.assertEquals(checkoutLapa.getErrorText(), "Error: First Name is required");

        checkoutLapa.inputFirstName("Vova");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(), "Error: Last Name is required");
        checkoutLapa.inputLastName("Ozols");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(), "Error: Postal Code is required");
        checkoutLapa.inputZipPostalCode("6666LV");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getPageTitle().getText(),"CHECKOUT: OVERVIEW");

        CheckoutOverviewPage checkoutParskataLapa = new CheckoutOverviewPage(driver);
        checkoutParskataLapa.getFinishButton().click();


        CheckoutSuccessPage checkoutIznakumaLapa = new CheckoutSuccessPage(driver);

        checkoutIznakumaLapa.getBackHomeButton().click();
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");
        System.out.println("Mājās");



    }


}




