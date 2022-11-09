package lekcijaSeptiniTest.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends BaseTest {

//
//    @Test
//    public void testLoginEmptyUsernameAndPassword() {
//        testLogin("","", "Epic sadface: Username is required");
//    }

    @Test
    public void testLoginEmptyUsernameAnsPasword() throws InterruptedException {
        WebElement lietotjVardaIevadesLauks = parluks.findElement(By.id("user-name"));
        lietotjVardaIevadesLauks.sendKeys("mazpamazam");

        WebElement parolesIevadesLauks = parluks.findElement(By.id("password"));
        parolesIevadesLauks.sendKeys("bumbum");

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText,"Epic sadface: Username and password do not match any user in this service");

        Thread.sleep(5000);

    }

//    @Test
//    public void testLoginEmptyUsernameAndFilledPassword () {
//        testLogin("", "dfsdfsdfsd", "Epic sadface: Username is required");
//    }
//
//
//
//    @Test
//    public void testLoginFilledUsernameAndEmptyPassword () {
//        testLogin("testtest", "", "Epic sadface: Password is required");
//    }






//    @Test
//    public void testLoginEmptyUsername() throws InterruptedException {
//        WebElement lietotjVardaIevadesLauks = parluks.findElement(By.id("user-name"));
//        lietotjVardaIevadesLauks.sendKeys("");
//
//        WebElement loginPoga = parluks.findElement(By.id("login-button"));
//        loginPoga.click();
//
//        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));
//
//        String errorText = errorTextField.getText();
//        Assert.assertEquals(errorText,"Epic sadface: Username is required");
//
//        Thread.sleep(5000);
//
//    }

//    @Test
//    public void testLoginEmptyPassword() throws InterruptedException {
//        WebElement ParolesIevadesLauks = parluks.findElement(By.id("password"));
//        ParolesIevadesLauks.sendKeys("");
////        WebElement loginPoga = parluks.findElement(By.id("login-button"));
//        loginPoga.click();
////        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));
////        String errorText = errorTextField.getText();
//        Assert.assertEquals(errorText,"Epic sadface: Password is required");
////        Thread.sleep(5000);
//
//    }


}
