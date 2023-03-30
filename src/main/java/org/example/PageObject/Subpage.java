package org.example.PageObject;

import org.example.Base.Settings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subpage {
    @FindBy(xpath = "/html/body/div[2]/div/div/form/input[1]")
    public
    WebElement checkbox1;

    @FindBy(id="hot-spot")
    public WebElement box;

    @FindBy(id="column-a")
    public WebElement drag;

    @FindBy(id="column-b")
    public WebElement drop;
    @FindBy(id="file-upload")
    public WebElement choosefile;

    @FindBy(id="file-submit")
    public WebElement upload;

    @FindBy(xpath = "/html/body/div[2]/div/div/a[1]")
    public WebElement download;
    public Subpage(){
        PageFactory.initElements(Settings.driver,this);
    }
}
