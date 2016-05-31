package com.softech.wlcms.pages.publish;

import com.softech.wlcms.actions.WaitActions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;

//import com.ls360.wlcms.course.CoursePage;

public class PublishCoursePage extends WaitActions {
    private static final Logger logger = LoggerFactory.getLogger(PublishCoursePage.class);

    @FindBy(id = "frm_publish")
    private WebElementFacade publishForm;

    @FindBy(css = "#frm_publish .blue")
    private WebElementFacade onlinePublishButton;

    @FindBy(css = "#frm_webinar_publish .btn.blue")
    private WebElementFacade publishButton;


    @FindBy(css = "#frm_publish button[type='button']")
    private WebElementFacade cancelButton;

    @FindBy(css = "#publisToLMSBtn .switch-right")
    private WebElementFacade publishLMSOption;

    @FindBy(css = "#publisToSFBtn .switch-right.switch-default")
    private WebElement publishSFOption;

    @FindBy(id = "publishBtn")
    private WebElementFacade makeOffer;

    @FindBy(css = ".alert.alert-info.zero-margin")
    private WebElementFacade progressBox;

    @FindBy(id = "mSRP")
    private WebElementFacade listPrice;

    @FindBy(id = "lowestSalePrice")
    private WebElementFacade lowestSalePrice;

    @FindBy(css = "#confirmationModal button[type='button']")
    private List<WebElementFacade> yesButton;

    @FindBy(css = "#publisToLMSBtn [for='updateLMS']")
    private WebElementFacade updateCouseContent;

    @FindBy(css = "#publisToLMSBtn .switch-right.switch-default")
    private List<WebElementFacade> updateLMSOption;

    @FindBy(css = ".alert.alert-success.alert-dismissible.fade.in")
    private WebElementFacade publishAlert;

    @FindBy(id = "updateSF")
    private WebElementFacade updateSFOption;

    public void switchLMSPublishingOn() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true)", publishLMSOption);
        waitUntilLoaded(publishLMSOption);
        publishLMSOption.waitUntilClickable();
        publishLMSOption.click();
        logger.info("Switch LMS Publishing Option On");
    }


    public void clickCancel() {
        cancelButton.click();
    }

    public void waitPublishToComplete() {
//        WebElementFacade updateLMSOption = getDriver().find(By.id("updateLMS")));
        publishAlert.waitUntilNotVisible();
    }

    public void clickUpdateLmsOption() {
        WebElementFacade updateCourseContentButton = updateLMSOption.get(1);
        waitUntilLoaded(updateCourseContentButton);
        updateCourseContentButton.waitUntilClickable();
        updateCourseContentButton.click();
//        if (!updateLMSOption.isSelected()) {
//            updateLMSOption.click();
//            updateLMSOption.isSelected();
//        } else {
//            logger.info("Select Update LMS Option");
//        }
    }

    public void selectSFPublishCheckBox() {
        publishSFOption.click();
        publishSFOption.isSelected();
        logger.info("Select Publish to SF");
    }

    public void selectSFRePublishCheckBox() {
        updateSFOption.click();
        updateSFOption.isSelected();
        logger.info("Select Re-Publish to SF");
    }

    public boolean isUpdate() {
        return updateCouseContent.isDisplayed();
    }


    public void clickMakeOffer() {
        makeOffer.waitUntilClickable();
        makeOffer.click();
        logger.info("Make Offer on 360 Market Place");
    }

    public void fillPrice(String listPrice, String lowPrice) {
        this.listPrice.clear();
        this.listPrice.sendKeys(listPrice);
        logger.info("Fill List Price >" + listPrice);
        lowestSalePrice.clear();
        lowestSalePrice.sendKeys(lowPrice);

    }

    public void clickPublish() {
        publishButton.waitUntilClickable();
        publishButton.click();
        logger.info("Published the Course");
    }

    public boolean isProgressBoxVisible() {
        return progressBox.isDisplayed();
    }

    public void clickOnlinePublish() {
        onlinePublishButton.waitUntilClickable();
        onlinePublishButton.click();
        logger.info("Published the Course");
    }

}
