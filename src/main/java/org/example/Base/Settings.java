package org.example.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings extends Constant {
public static WebDriver driver;
public void setup(){
    System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
    driver = new ChromeDriver();

}
public void geturl(String url){
    driver.get(url);
}
public void teardown(){
    driver.quit();
}

}
