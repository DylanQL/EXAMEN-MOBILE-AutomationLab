package com.nttdata.steps;

import com.nttdata.screens.ProductScreem;

public class ProductSteps {

    ProductScreem productScreem;


    public void introducirCantidadProductos(int unidades) {
        productScreem.add_quantity_of_product(unidades);
    }

    public void agregarProductoCarritoDeCompras() {
        productScreem.click_on_add_to_cart();
    }
}
