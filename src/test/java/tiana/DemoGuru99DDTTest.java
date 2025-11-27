package tiana;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoGuru99DDTTest {
    private static WebDriver myBrowser;
    public static Object[][] initData(){
         String[][] accounts = {
                {"mngr642820", "AqepEqY"},
                 {"mngr647720", "AvapejA"}
        };
            return accounts;
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testLoginGivenRightManagerAccount(String user, String pass) throws InterruptedException {

        myBrowser.get("https://demo.guru99.com/V4");
        WebElement userTextBoxTag = myBrowser.findElement(
                By.xpath("//input[@name='uid']")
        );
        userTextBoxTag.sendKeys(user);
        WebElement passTextBoxTag = myBrowser.findElement(
                By.xpath("//input[@name='password']")
        );
        passTextBoxTag.sendKeys(pass);
        WebElement loginButtonTag = myBrowser.findElement(
                By.xpath("//input[@name='btnLogin']")
        );
        loginButtonTag.click();

        Thread.sleep(3000);
        WebElement welcomeLabelTag = myBrowser.findElement(By.cssSelector("tr[class='heading3'] td"));
        System.out.println("Welcome message caputed by Selenium: " + welcomeLabelTag.getText());
        assertEquals("Manger Id : "+ user, welcomeLabelTag.getText());

    }


    @BeforeAll
    public static void setup(){
        //Khởi tạo trình duyệt, khởi tạo kết nối csdl
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        myBrowser = new ChromeDriver();
        myBrowser.manage().window().maximize();


    }

    @AfterAll
    public static void tearDown()throws  InterruptedException{
            //ĐÓNG TRÌNH DUYỆT, ĐÓNG DB CONNECTION
        Thread.sleep(10000);//trước khi đóng trình duyệt, cho xem kết quả, dừng 5s
        myBrowser.quit();
    }



}