package com.serenity;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;


public class NavigationActions extends UIInteractionSteps {

    @Step("Navigate to the web page")
    public void navigateToPage(String url){
        openUrl(url);
        getDriver().manage().window().maximize();
    }

}
