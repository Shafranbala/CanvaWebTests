package com.shafranbala.tests.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginCanvaTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        if (app.header().isAvatarPresent()){
            app.header().logOut();
        }
    }

    @Test
    public void loginCanvaPositiveTest() throws InterruptedException {
        app.session().logOut();
        app.session().logIn("aia82@yandex.ru", "never1mind");

        Assert.assertTrue(app.header().isAvatarPresent());
    }

    @Test
    public void loginCanvaNegativeTest() throws InterruptedException {
        app.session().logIn("aia82@yandex.ru", "invalidPassword");

        Assert.assertFalse(app.header().isAvatarPresent());
    }
}
