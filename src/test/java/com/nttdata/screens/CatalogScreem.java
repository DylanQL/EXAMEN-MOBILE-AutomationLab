package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatalogScreem extends PageObject {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement lbl_title_screem;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private List<WebElement> lbl_title_of_product;


    public void click_on_product(String product) {
        // android.widget.ImageView[@content-desc="NOMBRE DE PRODUCTO"]
        new CommonActions().scrollAndClickByDescription(product);
    }
}
