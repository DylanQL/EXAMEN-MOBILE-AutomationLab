package com.nttdata.screens;

import net.thucydides.core.pages.PageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CartScreem extends PageObject {
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private WebElement lbl_name_product;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/noTV")
    private WebElement lbl_quantity_product;

    public String getNameProduct() {
        return lbl_name_product.getText();
    }

    public int getQuantityProduct() {
        return Integer.parseInt(lbl_quantity_product.getText());
    }
}
