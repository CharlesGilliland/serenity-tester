package greenkart;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;


public class NavigationActions extends UIInteractionSteps {

    @Step("Navigate to the web page")
    public void navigateToPage(){
        openUrl("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

}
