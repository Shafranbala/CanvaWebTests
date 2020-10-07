package com.shafranbala.tests.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    SessionHelper session;
    HeaderHelper header;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public SessionHelper session() {
        return session;
    }

    public HeaderHelper header () {
        return header;
    }

    public void init() {
        if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        }

        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.manage().window().maximize();

        wd.navigate().to("https://www.canva.com/");
        session = new SessionHelper(wd);
        header = new HeaderHelper(wd);
    }

    public void stop(){
        wd.quit();
    }
}
