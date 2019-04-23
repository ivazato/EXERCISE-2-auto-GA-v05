package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Adidas.Adidas;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionAdidas {

    private Adidas adidas;

    @Given("^'Adidas' page is loaded$")
    public void adidasPageIsLoaded() {
        adidas = LoadPage.adidasPage();
    }

    @When("^Hover HOMBRE link HEADER$")
    public void hoverOnHombreLink() throws Throwable {
        adidas.hoverOnHombreMenu();
    }

    @When("^Click Futbol link sub menú$")
    public void clickOnFutbol() throws Throwable {
        adidas.clickOnfutbol();
    }

    @And("^click on first product$")
    public void clickOnFirstProduct() {
        adidas.clickFirstItem();
    }

    @And("^Select talla of \"([^\"]*)\" dropdown guia de tallas$")
    public void selectTallaOfDropdownGuiaDeTallas(String arg0) throws Throwable {

    }


//    @When("^Select talla of \"(.*?)\" dropdown guia de tallas$")
//    public void selectTalla(String expected) throws InterruptedException {
//        String actualValue = adidas.getValueFromLabel();
//        Assert.assertEquals(actualValue, expected, "fail");
//    }
}
