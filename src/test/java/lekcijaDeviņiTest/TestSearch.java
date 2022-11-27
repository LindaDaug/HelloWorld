package lekcijaDeviņiTest;


import lekcijaDeviņi.MainPage;
import lekcijaDeviņi.SignInModal;
import lekcijaDeviņi.SearchResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch extends BaseTest {

    @Test
    public void testSearchFunctionality() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct("apelsīni");
        Thread.sleep(5000);

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        List<WebElement> searchResultList = searchResultsPage.getSerachresultList();
        Assert.assertEquals(searchResultList.size(), 6);

        mainPage.searchProduct("burkāni");
        searchResultList = searchResultsPage.getSerachresultList();
//        speciāli
//        System.out.println(searchResultList.get(0)
//                .findElement(By.xpath("//span[@itemprop='name']")).getText());

        Assert.assertEquals(searchResultList.size(), 23);
    }
@Test
    public void testRegistrationsWindowsCloseCorect () throws InterruptedException{
    MainPage mainPage = new MainPage(driver);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("b-mui-carousel--placeholder")));
    Thread.sleep(4000);
    mainPage.clickSignInButton();

    SignInModal signInModal = new SignInModal(driver);
    signInModal.waitForSignInModalToAppear();
    signInModal.closeButtonClick();

    Assert.assertEquals(signInModal.getModalWindow().size(),0);



}
}
