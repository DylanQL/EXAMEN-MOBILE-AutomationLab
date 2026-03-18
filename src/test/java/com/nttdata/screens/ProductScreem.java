package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ProductScreem extends PageObject {

    // Boton de ir al carrito
    @AndroidFindBy(accessibility = "Displays number of items in your cart")
    private WebElement btn_cart;
    // Localizador de boton de añadir al carrito
    String resourceIdAddToCart = "com.saucelabs.mydemoapp.android:id/cartBt";
    // Localizador de añadir un elemento al carrito
    String resourceIdQuantity = "com.saucelabs.mydemoapp.android:id/plusIV";

    public void click_on_cart() {
        btn_cart.click();
    }

    // metodo para agregar cantidad de productos
    public void add_quantity_of_product(int quantity) {
        if (quantity <= 0) {
            throw new AssertionError("No se puede agregar una cantidad menor o igual a cero.");
        }
        if (quantity > 1) {
            for (int i = 1; i < quantity; i++) {
                new CommonActions().scrollAndClickByResourceId(resourceIdQuantity);
            }
        }

    }
    public void click_on_add_to_cart() {
        new CommonActions().scrollAndClickByResourceId(resourceIdAddToCart);
    }
}
