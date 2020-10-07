package com.shafranbala.tests.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void logIn (String email, String pwd) throws InterruptedException {
        click(By.cssSelector("[aria-label='Log in']"));
        type(By.name("email"), email);
        type(By.name("password"), pwd);
        click(By.xpath("//*[@class='Oa7GLA OpVodg']//*[@class='KnkXXg _4dXjgA gLTEuQ XvGYmg vHcWfw _2ELgpQ _4dXjgA gLTEuQ XvGYmg spExZw _3SoQXQ AvEAGQ vM2UTA DM1_6g Ndwpug']"));
    }


    public void logOut() {
        click(By.cssSelector("[class='mB5KTw']"));

    }
}
