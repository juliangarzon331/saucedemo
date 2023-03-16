package com.demo.test.stepsdefinitions;

import com.demo.test.questions.VerifyProductName;
import com.demo.test.tasks.Login;
import com.demo.test.tasks.OpenPage;
import com.demo.test.tasks.SelectProduct;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SauceDemoStepsDefinitions {

    @Before
    public void InitialConfiguration() {
        setTheStage(new OnlineCast());
        OnStage.theActorCalled("The client");
    }

    @Given("que estoy en la pagina de inicio de sesion")
    public void queEstoyEnLaPaginaDeInicioDeSesion() {
        theActorInTheSpotlight().wasAbleTo(OpenPage.demoPage());
    }
    @When("ingreso mi nombre de usuario {string} y mi contrasena {string}")
    public void ingresoMiNombreDeUsuarioYMiContrasena(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(Login.enterCredentials(usuario, password));

    }
    @When("selecciono el producto con el nombre {string}")
    public void seleccionoElProducto(String producto) {
        theActorInTheSpotlight().attemptsTo(SelectProduct.selectProductByName(producto));

    }
    @Then("debo ver el nombre del producto {string}")
    public void deboVerElNombreDelProducto(String producto) {
        theActorInTheSpotlight().should(seeThat(VerifyProductName.productNameInThePage(producto)));




    }



}
