package tiana;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class DemoGuru99Test {
    private static WebDriver myBrowser;
    @Test
    public void testLoginGivenRightVaildManagerAccount() throws InterruptedException {

        myBrowser.get("https://demo.guru99.com/V4");
        //đi tìm các tag username, password nhập
        WebElement userTextBoxTag = myBrowser.findElement(
                By.xpath("//input[@name='uid']")
        );
        userTextBoxTag.sendKeys("mngr642823");
        WebElement passTextBoxTag = myBrowser.findElement(
                By.xpath("//input[@name='password']")
        );
        passTextBoxTag.sendKeys("jUguhYn");
        WebElement loginButtonTag = myBrowser.findElement(
                By.xpath("//input[@name='btnLogin']")
        );
        loginButtonTag.click();
        Thread.sleep(3000);
        WebElement welcomeLabelTag = myBrowser.findElement(By.cssSelector("tr[class='heading3'] td"));
        System.out.println("Welcome message caputed by Selenium: " + welcomeLabelTag.getText());
        assertEquals("Manger Id : mngr642823", welcomeLabelTag.getText());

    }


    @BeforeAll
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        myBrowser = new ChromeDriver();
        myBrowser.manage().window().maximize();


    }

    @AfterAll
    public static void tearDown()throws  InterruptedException{
        Thread.sleep(10000);
        myBrowser.quit();
    }



}