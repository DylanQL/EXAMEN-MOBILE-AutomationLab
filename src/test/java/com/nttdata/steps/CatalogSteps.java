package com.nttdata.steps;

import com.nttdata.screens.CatalogScreem;

public class CatalogSteps {

    CatalogScreem catalogScreem;

    public void validarVentanaInicial() {
        boolean isOnInitialScreen = catalogScreem.detectarTituloPantalla();
        if (!isOnInitialScreen){
            throw new AssertionError("No se encuentra en la pantalla inicial");
        }
    }

    public void validarProductosCargados() {
        if (catalogScreem.obtenerCantidadProductos() == 0){
            throw new AssertionError("No se cargaron productos");
        }
    }

    public void seleccionarProduct(String productoName) {
        catalogScreem.click_on_product(productoName);
    }
}
