package com.serenity.directline;

import com.serenity.NavigationActions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenFillingInCarDetails {

    @Steps
    NavigationActions navigation;

    @Steps
    CarDetailsActions carDetails;


    @Test
    public void userCompletesFormByLookingUpCar() throws InterruptedException {
        // Setting up car details to check
        String reg = "RE60 OYB";
        String makeAndModel = "PEUGEOT 207";

        // Navigate to the web page
        navigation.navigateToPage("https://www.directline.com/car/quote/your-car");

        // Close the cookies window
        carDetails.acceptCookies();

        // Look up vehicle
        carDetails.lookUpVehicle(reg, makeAndModel);

        // Select is your vehicle
         carDetails.selectIsYourCar(true);

        // Select if a car or van
        carDetails.selectIsCar(true);

        // Select if car has been modified
        carDetails.enterCarModified(false);

        // Select if car has already been purchases
        carDetails.selectAlreadyPurchased(true);

        carDetails.selectPurchaseDate("Feb", "2019");

        // Enter estimated mileage
        carDetails.enterEstimatedMilage(6000);

        // Enter registered keeper
        carDetails.enterRegisteredKeeper(RegisteredKeepers.YOU);

        // Choose start date
        carDetails.selectPolicyStart("Tomorrow");

        // Choose cover type
        carDetails.selectCoverType(CoverTypes.THIRD_PARTY);
    }


}
