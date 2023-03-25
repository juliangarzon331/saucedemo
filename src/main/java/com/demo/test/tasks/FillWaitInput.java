package com.demo.test.tasks;

import com.demo.test.userinterfaces.WaitPage;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillWaitInput implements Task {

    private String textValue;

    public FillWaitInput(String textValue) {
        this.textValue = textValue;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WaitPage.ADDTEXTBOX1),
                WaitUntil.the(WaitPage.INPUT_TEXTBOX1, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(textValue).into(WaitPage.INPUT_TEXTBOX1)
              //  WaitFor.the(elementoDeseado).shouldBeVisible();


        );

    }

    public static FillWaitInput withValue(String textValue){
        return instrumented(FillWaitInput.class, textValue);
    }


}
