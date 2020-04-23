package com.softech.wlcms.features.upload_assets_verification;

import com.softech.wlcms.steps.common.WlcmsHomePageSteps;
import com.softech.wlcms.steps.common.WlcmsLoginSteps;
import com.softech.wlcms.steps.course_creation_steps.CourseCreationSteps;
import com.softech.wlcms.steps.upload_assets_steps.UploadAssetsSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by umair.javaid on 4/15/2016.
 */

@RunWith(SerenityRunner.class)
public class UploadAssetsOnlineCourseTest {
    private static final Logger logger = LoggerFactory.getLogger(UploadAssetsOnlineCourseTest.class);

    @Managed
    WebDriver driver;

    @Steps
    WlcmsLoginSteps wlcmsLoginSteps;

    @Steps
    WlcmsHomePageSteps wlcmsHomePageSteps;

    @Steps
    CourseCreationSteps courseCreationSteps;

    @Steps
    UploadAssetsSteps uploadAssetsSteps;

    @WithTag(type = "release", name = "regression-2-test")
    @Title("Verify PDF Upload In Slide For Online Course")
    @Test
    public void addPdfInLesson() {
        logger.info("<---------------------------------------------------->");
        logger.info("<-- Starting WLCMS Add PDF in Lesson for Online Course -->");
        logger.info("<---------------------------------------------------->");

        wlcmsLoginSteps.LogIntoWlcms();

        wlcmsHomePageSteps.verifyAndCloseTutorialBox();
        wlcmsHomePageSteps.navigatingToOnlineCourseCreation();

        courseCreationSteps.createOnlineCourse();
        courseCreationSteps.addLessonIntoOnlineCourse();

        courseCreationSteps.addSupportMaterial();

        uploadAssetsSteps.uploadPdfInLesson();

        logger.info("<----------------------------------------------------->");
        logger.info("<---- WLCMS Add PDF in Lesson Test is Completed ---->");
        logger.info("<----------------------------------------------------->");
    }

    @WithTag(type = "release", name = "regression-2-test")
    @Title("Verify Video Upload In Lesson For Online Course")
    @Test
    public void addVideoInLesson() {
        logger.info("<---------------------------------------------------->");
        logger.info("<-- Starting WLCMS Add Video in Lesson for Online Course -->");
        logger.info("<---------------------------------------------------->");

        wlcmsLoginSteps.LogIntoWlcms();

        wlcmsHomePageSteps.verifyAndCloseTutorialBox();
        wlcmsHomePageSteps.navigatingToOnlineCourseCreation();

        courseCreationSteps.createOnlineCourse();
        courseCreationSteps.addLessonIntoOnlineCourse();

        courseCreationSteps.navigateToUploadVideo();
        uploadAssetsSteps.uploadVideoInLesson();


        logger.info("<----------------------------------------------------->");
        logger.info("<---- WLCMS Add Video in Lesson Test is Completed ---->");
        logger.info("<----------------------------------------------------->");
    }

    @WithTag(type = "release", name = "regression-2-test")
    @Title("Verify Add PPT In Lesson For Online Course")
    @Ignore
    @Test
    public void addPptInLesson() {
        logger.info("<---------------------------------------------------->");
        logger.info("<-- Starting WLCMS Add PPT in Lesson for Online Course -->");
        logger.info("<---------------------------------------------------->");

        wlcmsLoginSteps.LogIntoWlcms();

        wlcmsHomePageSteps.verifyAndCloseTutorialBox();
        wlcmsHomePageSteps.navigatingToOnlineCourseCreation();

        courseCreationSteps.createOnlineCourse();
        courseCreationSteps.addLessonIntoOnlineCourse();

        courseCreationSteps.navigateToUploadPpt();
        uploadAssetsSteps.uploadPptInLesson();


        logger.info("<----------------------------------------------------->");
        logger.info("<---- WLCMS Add PPT in Lesson Test is Completed ---->");
        logger.info("<----------------------------------------------------->");
    }

    @WithTag(type = "release", name = "regression-2-test")
    @Title("Verify Video Upload In Slide For Online Course")
    @Test
    public void addVideoInSlide() {
        logger.info("<---------------------------------------------------->");
        logger.info("<-- Starting WLCMS Add Video in Slide for Online Course -->");
        logger.info("<---------------------------------------------------->");

        wlcmsLoginSteps.LogIntoWlcms();

        wlcmsHomePageSteps.verifyAndCloseTutorialBox();
        wlcmsHomePageSteps.navigatingToOnlineCourseCreation();

        courseCreationSteps.createOnlineCourse();
        courseCreationSteps.addLessonIntoOnlineCourse();
        courseCreationSteps.addSlideIntoOnlineCourseMP4Template();
        courseCreationSteps.navigateToUploadVideoInSlide();

        uploadAssetsSteps.uploadVideoInSlide();


        logger.info("<----------------------------------------------------->");
        logger.info("<---- WLCMS Add Video in Slide Test is Completed ---->");
        logger.info("<----------------------------------------------------->");
    }

    @WithTag(type = "release", name = "regression-3-test")
    @Title("Verify Addition of Audio In Slide Component In MC-Scenario Template Under New Lesson")
    @Test
    public void addAudioInSlideComponentForMCScenarioTemplate() {

        logger.info("<---------------------------------------------------->");
        logger.info("<-- Starting WLCMS Audio in Slide with MC-Scenario Template Test -->");
        logger.info("<---------------------------------------------------->");
        wlcmsLoginSteps.LogIntoWlcms();

        wlcmsHomePageSteps.verifyAndCloseTutorialBox();
        wlcmsHomePageSteps.navigatingToOnlineCourseCreation();

        courseCreationSteps.createOnlineCourse();
        courseCreationSteps.addLessonIntoOnlineCourse();
        courseCreationSteps.addSlideIntoOnlineCourseMCScenarioTemplate();

        courseCreationSteps.addAudioInSlideComponent();
        uploadAssetsSteps.uploadAudioInSlide();

        logger.info("<----------------------------------------------------->");
        logger.info("<---- WLCMS Audio in Slide of MC-Scenario Template Test is Completed ---->");
        logger.info("<----------------------------------------------------->");
    }

    @WithTag(type = "release", name = "regression-3-test")
    @Title("Verify Addition of Video In Slide Component In MC-Scenario Template Under New Lesson")
    @Test
    public void addVideoInSlideComponentForMCScenarioTemplate() {

        logger.info("<---------------------------------------------------->");
        logger.info("<-- Starting WLCMS Video in Slide with MC-Scenario Template Test -->");
        logger.info("<---------------------------------------------------->");
        wlcmsLoginSteps.LogIntoWlcms();

        wlcmsHomePageSteps.verifyAndCloseTutorialBox();
        wlcmsHomePageSteps.navigatingToOnlineCourseCreation();

        courseCreationSteps.createOnlineCourse();
        courseCreationSteps.addLessonIntoOnlineCourse();
        courseCreationSteps.addSlideIntoOnlineCourseMCScenarioTemplate();

        courseCreationSteps.navigateToUploadVideoInMcScenarioSlide();
        uploadAssetsSteps.uploadVideoInMcScenarioSlide();

        logger.info("<----------------------------------------------------->");
        logger.info("<---- WLCMS Video in Slide of MC-Scenario Template Test is Completed ---->");
        logger.info("<----------------------------------------------------->");
    }

    @WithTag(type = "release", name = "regression-3-test")
    @Title("Verify Addition of XLS Document In Lesson Support Material")
    @Test
    public void addXlsInLessonSupportMaterial() {

        logger.info("<---------------------------------------------------->");
        logger.info("<-- Starting WLCMS Upload XLS in Lesson Support Material Test -->");
        logger.info("<---------------------------------------------------->");
        wlcmsLoginSteps.LogIntoWlcms();

        wlcmsHomePageSteps.verifyAndCloseTutorialBox();
        wlcmsHomePageSteps.navigatingToOnlineCourseCreation();

        courseCreationSteps.createOnlineCourse();
        courseCreationSteps.addLessonIntoOnlineCourse();
        courseCreationSteps.addSupportMaterial();

        uploadAssetsSteps.uploadXlsInLesson();


        logger.info("<----------------------------------------------------->");
        logger.info("<---- WLCMS XLS Document Lesson Support Material Test is Completed ---->");
        logger.info("<----------------------------------------------------->");
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
