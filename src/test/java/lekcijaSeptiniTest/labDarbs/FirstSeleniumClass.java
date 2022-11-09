package lekcijaSeptiniTest.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumClass {
    WebDriver parluks;

    @BeforeMethod
public void setUpBrowser() {
        parluks = new ChromeDriver();
        parluks.navigate().to("https://lu.lv");
        parluks.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownBrowser()
    {
        parluks.quit();
    }

    @Test
    public void testFirstWebPage (){
        System.out.println("Pirmais Selenium tests");


    }
    @Test
    public void testPagetitle () {

        parluks.get("https://lu.lv");
        String nosaukums = parluks.getTitle();
        Assert.assertEquals(nosaukums, "Latvijas Universitāte");


    }
    }


