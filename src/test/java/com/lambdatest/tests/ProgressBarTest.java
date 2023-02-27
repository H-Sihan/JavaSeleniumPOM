package com.lambdatest.tests;

//import org.aspectj.bridge.Message;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.lambdatest.pages.BootstrapProgressBarPage;

public class ProgressBarTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();
    BootstrapProgressBarPage progressBarPage = new BootstrapProgressBarPage();

    @Test
    public void testProgressBarPercentage(){
        progressBarPage = homePage.clickBootstrapProgressBar();
        progressBarPage.clickStartDownloadButton();
        String actualMessage = progressBarPage.getCompletedMessage();
        String actualPercentage = progressBarPage.getProgressBarPercentage();
        String expectedMessage = "Dowload completed!";
        String expectedPercentage = "100%";

        softAssert.assertEquals(actualMessage, expectedMessage, "\n The Message Is Not Complete Or Correct \n");
        softAssert.assertEquals(actualPercentage, expectedPercentage, "\n Percentage Is Not 100% \n");
        softAssert.assertAll();
    }
}
