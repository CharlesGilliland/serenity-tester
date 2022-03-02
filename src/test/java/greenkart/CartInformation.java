package greenkart;

import net.serenitybdd.core.pages.PageObject;

public class CartInformation extends PageObject {
    public String totalItems(){
        return $("(//div[@class='cart-info']//tr[contains(.,'Items')]/td)[3]").getText();
    }

    public String totalPrice(){
        return $("(//div[@class='cart-info']//tr[contains(.,'Price')]/td)[3]").getText();
    }
}
