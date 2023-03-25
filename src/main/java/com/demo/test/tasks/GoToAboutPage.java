package com.demo.test.tasks;

import com.demo.test.userinterfaces.ProductListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToAboutPage  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductListPage.BOTON_MENU),
                Click.on(ProductListPage.LINK_ABOUT)
        );


    }

    public static GoToAboutPage  aboutlink(){
        return instrumented(GoToAboutPage.class);
    }
}
