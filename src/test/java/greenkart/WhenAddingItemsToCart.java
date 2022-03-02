package greenkart;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenAddingItemsToCart extends UIInteractionSteps {

    @Managed
    WebDriver driver;

    @Steps
    NavigationActions navigationActions;

    @Steps
    AddToCartActions addToCart;

    CartInformation cart;
    ProductPage productPage;

    @Test
    public void theCorrectAmountOfItemsAreAdded(){
        navigationActions.navigateToPage();

        // Check the cart is empty
        Serenity.reportThat("Checking the cart has 0 items", () -> {
            Assert.assertTrue(cart.totalItems().equals("0"));
        });

        // Add products to cart
        addToCart.addItem("Brocolli");
        addToCart.addItem("Cauliflower");
        addToCart.addItem("Beetroot");

        // Check the items are added
        Serenity.reportThat("Checking the cart price is 0", () -> {
            Assert.assertTrue(cart.totalItems().equals("3"));
        });
    }

    @Test
    public void theCorrectPriceIsUpdatedWhenTheSameItemIsAdded(){
        navigationActions.navigateToPage();

        // Check the cart is empty
        Serenity.reportThat("Checking the cart has 0 items", () -> {
            Assert.assertTrue(cart.totalItems().equals("0"));
        });
        // Check the price is 0
        Serenity.reportThat("Checking the price is 0", () -> {
            Assert.assertTrue(cart.totalPrice().equals("0"));
        });

        // Declare item and capture its price
        String itemToAdd = "Brocolli";
        String price = productPage.itemPriceByName(itemToAdd);

        // Add a single item
        addToCart.addItem(itemToAdd);

        // Check the cart price is updated
        Serenity.reportThat("Checking the cart price is updated", () -> {
            Assert.assertTrue(cart.totalPrice().equals(price));
        });

        // Adding a second item
        addToCart.addItem(itemToAdd);

        String updatedPrice = String.valueOf(Integer.parseInt(price)*2);

        // Check the cart price is updated
        Serenity.reportThat("Checking the cart price is updated", () -> {
            Assert.assertTrue(cart.totalPrice().equals(updatedPrice));
        });

        // Checking that the items count is still 1
        Serenity.reportThat("Checking the cart has 0 items", () -> {
            Assert.assertTrue(cart.totalItems().equals("1"));
        });

    }


}
