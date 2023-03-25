package com.demo.test.tasks;

import com.demo.test.userinterfaces.ProductListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OrderPriceList implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> priceValues= ProductListPage.PRICE_LIST.resolveAllFor(actor).texts();
        System.out.println("HOlA");
    }

    public static OrderPriceList fromMintoMax(){
        return instrumented(OrderPriceList.class);
    }

}
