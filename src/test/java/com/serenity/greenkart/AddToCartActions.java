package com.serenity.greenkart;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class AddToCartActions extends UIInteractionSteps {

    ProductPage productPage;

    @Step("Adding {0} to cart")
    public void addItem(String itemName){
        $(productPage.addToCartButtonFor(itemName)).click();
    }

}
