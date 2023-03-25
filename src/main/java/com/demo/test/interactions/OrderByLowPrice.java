package com.demo.test.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.WebElement;

import static com.demo.test.userinterfaces.ProductListPage.DROPDOWN_SORT_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OrderByLowPrice  implements Interaction {

    private String opcion;
    public OrderByLowPrice(String opcion) {
        this.opcion = opcion;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
       // WebElement selectSort= DROPDOWN_SORT_PRODUCT.resolveFor(actor);
        actor.attemptsTo(SelectFromOptions.byVisibleText(opcion).from(DROPDOWN_SORT_PRODUCT));

    }

    public static OrderByLowPrice Ascendent(String opcion){
        return instrumented(OrderByLowPrice.class, opcion);

    }

}
