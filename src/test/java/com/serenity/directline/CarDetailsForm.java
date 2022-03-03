package com.serenity.directline;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarDetailsForm extends PageObject {
    public  By cookiesAccept = By.id("onetrust-accept-btn-handler");

    public By registrationInput = By.id("regSearch");
    public By registrationLookupButton = By.id("find-reg");
    public By carDisplay = By.cssSelector(".panel__title");

    public By isYourCarYes = By.cssSelector("label[for=isYourCar-Yes]");
    public By isYourCarNo = By.cssSelector("label[for=isYourCar-No]");

    public By carSelector = By.cssSelector("label[for=isCarOrVan-Car]");
    public By vanSelector = By.cssSelector("label[for=isCarOrVan-Van]");

    public By carHasBeenModifiedSelector = By.cssSelector("label[for=vehicleModified-Yes]");
    public By carHasNotBeenModifiedSelector = By.cssSelector("label[for=vehicleModified-No]");

    public By carAlreadyPurchased = By.cssSelector("label[for=vehiclePurchased-Yes]");
    public By carNotAlreadyPurchased = By.cssSelector("label[for=vehiclePurchased-No]");

    public By purchaseMonthSelect = By.id("vehiclePurchasedDate-month");
    public By purchaseYearSelect = By.id("vehiclePurchasedDate-year");

    public By mileageInput = By.id("mileage");

    public By registeredKeeperSelect = By.id("registeredKeeper");

    public By chooseStartDate = By.cssSelector("label[for=dlg-calendar-dateType-Choose]");
    public By todayStartDate = By.cssSelector("label[for=dlg-calendar-dateType-Today]");
    public By tomorrowStartDate = By.cssSelector("label[for=dlg-calendar-dateType-Tomorrow]");

    public By coverTypeThirdParty = By.cssSelector("label[for='damageCover-I need Third Party, Fire and Theft']");
    public By coverTypeComprehensive = By.cssSelector("label[for='damageCover-I need Comprehensive']");
}
