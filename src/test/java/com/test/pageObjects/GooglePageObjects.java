package com.test.pageObjects;

import org.openqa.selenium.By;

public class GooglePageObjects {

    public static By SearchBar = By.xpath("//input[@title='Search']");

    public static By TopStoriesSection = By.xpath("//div[contains(text(), 'Top stories') and @role='heading']");

    public static By StatisticSection = By.xpath( "(//div[contains(text(), 'Statistic') and @role='heading'])[1]");

    public static By MOHLink = By.xpath("//a[@href='http://covid-19.moh.gov.my/']");
}
