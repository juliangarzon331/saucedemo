package com.demo.test.tasks;

import com.demo.test.userinterfaces.ProductListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProduct implements Task {

    private String product;

    public SelectProduct(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductListPage.LABEL_TITLE.of(product))
        );

    }

    public static SelectProduct selectProductByName(String product){
        return instrumented(SelectProduct.class, product);
    }


}
