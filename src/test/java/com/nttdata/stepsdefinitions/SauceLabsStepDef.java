package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CartSteps;
import com.nttdata.steps.CatalogSteps;
import com.nttdata.steps.ProductSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SauceLabsStepDef {

    @Steps
    CatalogSteps catalogSteps;
    @Steps
    ProductSteps productSteps;
    @Steps
    CartSteps cartSteps;

    //Unidades del producto a agregar al carrito
    private int unidades;
    //Nombre del producto a agregar al carrito
    private String productoName;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        catalogSteps.validarVentanaInicial();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        catalogSteps.validarProductosCargados();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(int unidades, String productoName) {
        this.unidades = unidades;
        this.productoName = productoName;
        catalogSteps.seleccionarProduct(productoName);
        productSteps.introducirCantidadProductos(unidades);
        productSteps.agregarProductoCarritoDeCompras();
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        productSteps.irAlCarritoDeCompras();
        cartSteps.validarNombreProductoAgregado(productoName);
        cartSteps.validarCantidadAgregada(unidades);
    }
}
