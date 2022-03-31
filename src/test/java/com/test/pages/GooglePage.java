package com.test.pages;

import com.test.pageObjects.GooglePageObjects;
import com.test.utilities.Action;

public class GooglePage{

    public static void EnterSearchGoogle(String search){
        Action.sendKeys(GooglePageObjects.SearchBar, search);
        Action.pressEnter(GooglePageObjects.SearchBar);
    }

    public static void VerifyTopStoriesSection() {
       Action.assertElementDisplayed(GooglePageObjects.TopStoriesSection);
    }

    public static void VerifyStatisticSection() {
        Action.assertElementDisplayed(GooglePageObjects.StatisticSection);
    }

    public static void VerifyMOHLink() {
        Action.assertElementDisplayed(GooglePageObjects.MOHLink);
    }

    public static void ClickMOHLink() {
        Action.click(GooglePageObjects.MOHLink);
    }

    public static void VerifyMOHLandingPage() {
        Action.verifyPageTitle("Home | COVID-19 MALAYSIA");
    }

    public static void OpenURL(String url) {
        Action.openURL(url);
    }
}
