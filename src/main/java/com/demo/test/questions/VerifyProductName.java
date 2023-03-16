package com.demo.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.demo.test.userinterfaces.ProductListPage.LABEL_PRODUCTO;

public class VerifyProductName implements Question<Boolean> {

    String productName;

    public VerifyProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if(LABEL_PRODUCTO.resolveFor(actor).getText().equals(productName)){
            return true;
        }
        else{
            return false;
        }
    }

    public static VerifyProductName productNameInThePage(String productName) {
        return new VerifyProductName(productName);
    }
}
