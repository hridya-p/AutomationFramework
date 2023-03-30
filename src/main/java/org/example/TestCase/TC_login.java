package org.example.TestCase;

import org.example.Base.Settings;
import org.example.PageObject.Pagelogin;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.example.PageObject.Pagelogin;

public class TC_login extends Settings {
@Test
    public void TC1(){
        setup();
        geturl(URL);
        Pagelogin x= new Pagelogin();
        x.login(USERNAME,PASSWORD);
        teardown();

    }

}
