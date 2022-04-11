package org.testcases;


import org.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Listeners({TestAllureListener.class})
public class MavenTestNGExample2 extends BaseTest {

    Methods m = null;

    @Test
    public void myTestnew() {
        m = new Methods(driver);
        System.out.println("I am in my Test Class 2");
        driver.get("https://www.facebook.com/");
        String s=driver.getTitle();
        Assert.assertEquals(s,"ssss");

    }


}



