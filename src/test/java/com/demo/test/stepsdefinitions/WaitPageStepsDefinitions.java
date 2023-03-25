package com.demo.test.stepsdefinitions;

import com.demo.test.tasks.FillWaitInput;
import com.demo.test.tasks.OpenWaitPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class WaitPageStepsDefinitions {

    @Before
    public void InitialConfiguration() {
        setTheStage(new OnlineCast());
        OnStage.theActorCalled("The client");
    }

    @Given("que estoy en la pagina de waits")
    public void queEstoyEnLaPaginaDeWaits() {
      theActorInTheSpotlight().attemptsTo(OpenWaitPage.waitUrl());
    }
    @When("doy clic al boton {int}")
    public void doyClicAlBoton(Integer int1) {
        theActorInTheSpotlight().attemptsTo(FillWaitInput.withValue("abc"));

    }
    @Then("debo ver el input")
    public void deboVerElInput() {

    }
}
