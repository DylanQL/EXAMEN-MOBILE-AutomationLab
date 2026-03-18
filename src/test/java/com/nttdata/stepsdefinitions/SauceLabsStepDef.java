package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CatalogSteps;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SauceLabsStepDef {

    @Steps
    CatalogSteps catalogSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        catalogSteps.validarVentanaInicial();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("agrego <UNIDADES> del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
