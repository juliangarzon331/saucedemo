package com.demo.test.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductListPage {

    public static final Target LABEL_TITLE= Target.the("Titulo")
            .locatedBy("//div[contains(text(), '{0}')]");
    public static final Target LABEL_PRODUCTO= Target.the("Producto")
            .located(By.xpath("//div[contains(@class, 'inventory_details_name')]"));




}
