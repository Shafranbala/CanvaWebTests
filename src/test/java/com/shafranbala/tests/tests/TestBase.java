package com.shafranbala.tests.tests;

import com.shafranbala.tests.framework.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));
    //Logger logger = LoggerFactory.getLogger(com.shafranbala.tests.tests.TestBase.class);

    @BeforeSuite
    public void setUp() throws InterruptedException {
        app.init();
        app.session().logIn("aia82@yandex.ru", "never1mind");
    }

    @AfterSuite (enabled = false)
    public void tearDown(){
        app.stop();
    }
}
