package com.nttdata.steps;

import com.nttdata.screens.CartScreem;

public class CartSteps {

    CartScreem cartScreem;

    public void validarNombreProductoAgregado(String productoName) {
        String productNameScreen = cartScreem.getNameProduct();
        if (!productNameScreen.equals(productoName)) {
            throw new AssertionError("El producto agregado al carrito no coincide con el producto seleccionado");
        }
    }

    public void validarCantidadAgregada(int unidades) {
        int quantityProductScreen = cartScreem.getQuantityProduct();
        if (quantityProductScreen != unidades) {
            throw new AssertionError("La cantidad agregada al carrito no coincide con la cantidad seleccionada");
        }
    }
}
