package org.example.PageObject;

import org.example.Base.Settings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagelogin extends Settings{
    WebDriver driver;

    @FindBy(id="user-name")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="login-button")
    WebElement Loginbutton;
    public Pagelogin(){
        PageFactory.initElements(Settings.driver, this);
    }
    public void login(String user,String pass )
    {
        username.sendKeys(user);
        password.sendKeys(pass);
        Loginbutton.click();
    }
}
