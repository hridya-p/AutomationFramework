package org.example.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class normal {
    public WebDriver driver;
@BeforeMethod
    public void Driver_setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    driver.get("https://www.saucedemo.com/");

}
    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }
    @Test(priority = 0)
    public void test1() {
        //First test case for valid login
        //Finding the web elements and passing the values
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

      //  Thread.sleep(5000);

        System.out.println("success");

        }

    @Test(priority = 1)
    public void test2(){

        //Second test case for invalid login credentials
        driver.findElement(By.id("user-name")).sendKeys("abdc");
        driver.findElement(By.id("password")).sendKeys("Password");
        driver.findElement(By.id("login-button")).click();

        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.equals(expectedURL))
            System.out.println("Test passed !!!!");
        else
            System.out.println("Test failed !!!!");


   }

}