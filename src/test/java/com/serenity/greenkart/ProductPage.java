package com.serenity.greenkart;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class ProductPage extends PageObject {
    public By addToCartButtonFor(String itemName) {
        return By.xpath("//div[@class='product'][contains(.,'" + parseItemName(itemName) + "')]//button");
    }

    public String itemPriceByName(String itemName){
        return $("xpath://div[@class='product'][contains(.,'" + parseItemName(itemName) + "')]//p").getText();
    }

    public String parseItemName(String originalString){
        return originalString.split("-")[0].trim();
    }
}
