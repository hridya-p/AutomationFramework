package org.example.TestCase;

import org.example.Base.Settings;
import org.example.PageObject.Subpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.example.PageObject.testpage;
import java.util.concurrent.TimeUnit;
import java.util.List;

import static java.lang.Thread.sleep;

public class ChcekAction extends Settings {

    @BeforeMethod
    public void openpage(){
        setup();
        geturl(test_url);
    }

  /*  @AfterMethod
    public void closepage(){
        teardown();

    }
    */


    @Test(priority = 0)
    public void test( ) throws InterruptedException {

     ////////Test case//////
       testpage y= new testpage();
        y.checkboxtext.click();

        Subpage z= new Subpage();
        z.checkbox1.click();

        Boolean bool1 =z.checkbox1.isSelected();
        if(bool1==false){
            System.out.println("unchecking");
            z.checkbox1.click();
            }
    }

    @Test(priority = 1)
    public void rightclick(){
        testpage y=new testpage();
        y.contextmenu.click();


        Actions actions = new Actions(driver);
        Subpage z= new Subpage();
        actions.contextClick(z.box).perform();
        driver.switchTo().alert().accept();
    }

    @Test(priority =2)
    public void dragdrop(){
        testpage y= new testpage();
        y.dragndrop.click();
        Actions actions = new Actions(driver);
        Subpage z= new Subpage();
        actions.dragAndDrop(z.drag, z.drop).build().perform();

        System.out.println("Drag and drop");

    }

    @Test(priority = 3)
    public void fileupload() throws InterruptedException {
        testpage y= new testpage();
        y.fileupload.click();

        Subpage z= new Subpage();
        z.choosefile.sendKeys("/home/hridya/Downloads/HP Framwork1/src/main/resources/test.png");
        Thread.sleep(1000);
      z.upload.click();

        WebElement successMessage = driver.findElement(By.tagName("h3"));
        String messageText = successMessage.getText();
        if (messageText.equals("File Uploaded!")) {
            System.out.println("File uploaded successfully");
        } else {
            System.out.println("File upload failed");
        }




    }
    @Test(priority = 4)
    public void download(){
        testpage y = new testpage();

        y.filedownload.click();
        Subpage z= new Subpage();
        z.download.click();

    }
}
