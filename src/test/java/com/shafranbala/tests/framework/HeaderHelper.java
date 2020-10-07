package com.shafranbala.tests.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase {

    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public boolean isAvatarPresent(){
        return isElementPresent(By.cssSelector("[class='mB5KTw']"));
    }

    public void logOut() {
        clickOnAvatar();
        clickLogOut();
    }

    private void clickLogOut() {
        click(By.xpath("//li[@class='QoL5iA']/[@class='I9fXwQ']"));
    }

    private void clickOnAvatar() {
        click(By.cssSelector("[class='mB5KTw']"));
    }
}
