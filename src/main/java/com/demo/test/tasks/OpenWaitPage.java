package com.demo.test.tasks;

import com.demo.test.userinterfaces.LoginPage;
import com.demo.test.userinterfaces.WaitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWaitPage implements Task {

    private WaitPage waitPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(waitPage));

    }

    public static OpenWaitPage waitUrl(){
        return instrumented(OpenWaitPage.class);
    }
}
