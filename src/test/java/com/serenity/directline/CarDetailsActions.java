package com.serenity.directline;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class CarDetailsActions extends UIInteractionSteps {

    CarDetailsForm detailsForm;

    @Step("Accept cookies for the page")
    public void acceptCookies(){
        find(detailsForm.cookiesAccept).click();
    }

    @Step("The registration is entered and the result is checked")
    public void lookUpVehicle(String reg, String makeAndModel) {
        find(detailsForm.registrationInput).sendKeys(reg);
        find(detailsForm.registrationLookupButton).click();

        System.out.println(find(detailsForm.carDisplay).getText());

        Serenity.reportThat("Car found registration should match '{1}'", () -> {
            Assert.assertTrue((find(detailsForm.carDisplay)).getText().equalsIgnoreCase(makeAndModel));
        });
    }

    @Step("Selecting if this is your vehicle")
    public void selectIsYourCar(boolean yourVehicle) {
        if(yourVehicle){
            find(detailsForm.isYourCarYes).click();
        } else {
            find(detailsForm.isYourCarNo).click();
        }
    }

    @Step("Selecting if the vehicle is a car or van")
    public void selectIsCar(boolean isCar){
        if(isCar){
            find(detailsForm.carSelector).click();
        } else {
            find(detailsForm.vanSelector).click();
        }
    }

    @Step
    public void enterCarModified(boolean carModified) {
        if(carModified){
            find(detailsForm.carHasBeenModifiedSelector).click();
        } else {
            find(detailsForm.carHasNotBeenModifiedSelector).click();
        }
    }

    @Step
    public void selectAlreadyPurchased(boolean alreadyPurchased) {
        if(alreadyPurchased){
            find(detailsForm.carAlreadyPurchased).click();
        } else {
            find(detailsForm.carNotAlreadyPurchased).click();
        }
    }

    public void selectPurchaseDate(String month, String year) {
        Select monthSelect = new Select(find(detailsForm.purchaseMonthSelect));
        Select yearSelect = new Select(find(detailsForm.purchaseYearSelect));
        monthSelect.selectByVisibleText(month);
        yearSelect.selectByVisibleText(year);
    }

    @Step
    public void enterEstimatedMilage(int milage) {
        find(detailsForm.mileageInput).sendKeys(String.valueOf(milage));
    }

    @Step
    public void enterRegisteredKeeper(RegisteredKeepers keeper) {
        Select keeperSelect = new Select(find(detailsForm.registeredKeeperSelect));
        keeperSelect.selectByVisibleText(keeper.getValue());
    }

    @Step
    public void selectPolicyStart(String startDate) {
        if(startDate.equalsIgnoreCase("today")){
            find(detailsForm.todayStartDate).click();
        } else if(startDate.equalsIgnoreCase("tomorrow")){
            find(detailsForm.tomorrowStartDate).click();
        } else {
            find(detailsForm.chooseStartDate).click();
        }
    }

    @Step
    public void selectCoverType(CoverTypes coverType) {
        if(coverType == CoverTypes.THIRD_PARTY){
            find(detailsForm.coverTypeThirdParty).click();
        } else {
            find(detailsForm.coverTypeComprehensive).click();
        }
    }



}
