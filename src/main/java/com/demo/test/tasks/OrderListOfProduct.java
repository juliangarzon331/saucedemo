package com.demo.test.tasks;

import com.demo.test.interactions.OrderByLowPrice;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OrderListOfProduct implements Task {

    String opcion;

    public OrderListOfProduct(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(OrderByLowPrice.Ascendent(opcion));


    }

    public static OrderListOfProduct byOption( String opcion){
        return instrumented(OrderListOfProduct.class, opcion);
    }
}
