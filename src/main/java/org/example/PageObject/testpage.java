package org.example.PageObject;

import org.example.Base.Settings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class testpage {
    @FindBy(partialLinkText="Checkboxes")
   public WebElement checkboxtext;

    @FindBy(partialLinkText = "Context Menu")
    public WebElement contextmenu;

    @FindBy(partialLinkText = "Drag and Drop")
    public WebElement dragndrop;

    @FindBy(partialLinkText = "File Upload")
    public WebElement fileupload;

    @FindBy(partialLinkText = "File Download")
    public WebElement filedownload;

    public testpage(){
        PageFactory.initElements(Settings.driver,this);
    }

}
