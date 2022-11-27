package lekcijaSeptiniTest.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumClass {
    WebDriver driver;

    @BeforeMethod
public void setUpBrowser() {
        driver = new ChromeDriver();
        driver.navigate().to("https://lu.lv");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownBrowser(){
        driver.quit();
    }

//    @Test
//    public void testFirstWebPage(){
//        datePicker.setDate("2",4,"1993");
//    }

    @Test
    public void testPageTitle(){
        String nosaukums = driver.getTitle();
        Assert.assertEquals(nosaukums,"Latvijas Universitāte");
    }

    @Test
    public void testRandom(){

    }

}


